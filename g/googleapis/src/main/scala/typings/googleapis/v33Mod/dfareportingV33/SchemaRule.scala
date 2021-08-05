package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule associates an asset with a targeting template for asset-level
  * targeting. Applicable to INSTREAM_VIDEO creatives.
  */
trait SchemaRule extends StObject {
  
  /**
    * A creativeAssets[].id. This should refer to one of the parent assets in
    * this creative. This is a required field.
    */
  var assetId: js.UndefOr[String] = js.undefined
  
  /**
    * A user-friendly name for this rule. This is a required field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A targeting template ID. The targeting from the targeting template will
    * be used to determine whether this asset should be served. This is a
    * required field.
    */
  var targetingTemplateId: js.UndefOr[String] = js.undefined
}
object SchemaRule {
  
  inline def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  extension [Self <: SchemaRule](x: Self) {
    
    inline def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetingTemplateId(value: String): Self = StObject.set(x, "targetingTemplateId", value.asInstanceOf[js.Any])
    
    inline def setTargetingTemplateIdUndefined: Self = StObject.set(x, "targetingTemplateId", js.undefined)
  }
}
