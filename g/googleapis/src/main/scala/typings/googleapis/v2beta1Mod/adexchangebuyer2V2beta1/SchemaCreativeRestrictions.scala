package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreativeRestrictions extends StObject {
  
  /**
    * The format of the environment that the creatives will be displayed in.
    */
  var creativeFormat: js.UndefOr[String | Null] = js.undefined
  
  var creativeSpecifications: js.UndefOr[js.Array[SchemaCreativeSpecification]] = js.undefined
  
  /**
    * Skippable video ads allow viewers to skip ads after 5 seconds.
    */
  var skippableAdType: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreativeRestrictions {
  
  inline def apply(): SchemaCreativeRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeRestrictions]
  }
  
  extension [Self <: SchemaCreativeRestrictions](x: Self) {
    
    inline def setCreativeFormat(value: String): Self = StObject.set(x, "creativeFormat", value.asInstanceOf[js.Any])
    
    inline def setCreativeFormatNull: Self = StObject.set(x, "creativeFormat", null)
    
    inline def setCreativeFormatUndefined: Self = StObject.set(x, "creativeFormat", js.undefined)
    
    inline def setCreativeSpecifications(value: js.Array[SchemaCreativeSpecification]): Self = StObject.set(x, "creativeSpecifications", value.asInstanceOf[js.Any])
    
    inline def setCreativeSpecificationsUndefined: Self = StObject.set(x, "creativeSpecifications", js.undefined)
    
    inline def setCreativeSpecificationsVarargs(value: SchemaCreativeSpecification*): Self = StObject.set(x, "creativeSpecifications", js.Array(value*))
    
    inline def setSkippableAdType(value: String): Self = StObject.set(x, "skippableAdType", value.asInstanceOf[js.Any])
    
    inline def setSkippableAdTypeNull: Self = StObject.set(x, "skippableAdType", null)
    
    inline def setSkippableAdTypeUndefined: Self = StObject.set(x, "skippableAdType", js.undefined)
  }
}
