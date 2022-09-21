package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1QuotaBucket extends StObject {
  
  /**
    * Admin override on this quota bucket.
    */
  var adminOverride: js.UndefOr[SchemaV1Beta1QuotaOverride] = js.undefined
  
  /**
    * Consumer override on this quota bucket.
    */
  var consumerOverride: js.UndefOr[SchemaV1Beta1QuotaOverride] = js.undefined
  
  /**
    * The default limit of this quota bucket, as specified by the service configuration.
    */
  var defaultLimit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dimensions of this quota bucket. If this map is empty, this is the global bucket, which is the default quota value applied to all requests that do not have a more specific override. If this map is nonempty, the default limit, effective limit, and quota overrides apply only to requests that have the dimensions given in the map. For example, if the map has key "region" and value "us-east-1", then the specified effective limit is only effective in that region, and the specified overrides apply only in that region.
    */
  var dimensions: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The effective limit of this quota bucket. Equal to default_limit if there are no overrides.
    */
  var effectiveLimit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Producer override on this quota bucket.
    */
  var producerOverride: js.UndefOr[SchemaV1Beta1QuotaOverride] = js.undefined
}
object SchemaV1Beta1QuotaBucket {
  
  inline def apply(): SchemaV1Beta1QuotaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1QuotaBucket]
  }
  
  extension [Self <: SchemaV1Beta1QuotaBucket](x: Self) {
    
    inline def setAdminOverride(value: SchemaV1Beta1QuotaOverride): Self = StObject.set(x, "adminOverride", value.asInstanceOf[js.Any])
    
    inline def setAdminOverrideUndefined: Self = StObject.set(x, "adminOverride", js.undefined)
    
    inline def setConsumerOverride(value: SchemaV1Beta1QuotaOverride): Self = StObject.set(x, "consumerOverride", value.asInstanceOf[js.Any])
    
    inline def setConsumerOverrideUndefined: Self = StObject.set(x, "consumerOverride", js.undefined)
    
    inline def setDefaultLimit(value: String): Self = StObject.set(x, "defaultLimit", value.asInstanceOf[js.Any])
    
    inline def setDefaultLimitNull: Self = StObject.set(x, "defaultLimit", null)
    
    inline def setDefaultLimitUndefined: Self = StObject.set(x, "defaultLimit", js.undefined)
    
    inline def setDimensions(value: StringDictionary[String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsNull: Self = StObject.set(x, "dimensions", null)
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setEffectiveLimit(value: String): Self = StObject.set(x, "effectiveLimit", value.asInstanceOf[js.Any])
    
    inline def setEffectiveLimitNull: Self = StObject.set(x, "effectiveLimit", null)
    
    inline def setEffectiveLimitUndefined: Self = StObject.set(x, "effectiveLimit", js.undefined)
    
    inline def setProducerOverride(value: SchemaV1Beta1QuotaOverride): Self = StObject.set(x, "producerOverride", value.asInstanceOf[js.Any])
    
    inline def setProducerOverrideUndefined: Self = StObject.set(x, "producerOverride", js.undefined)
  }
}
