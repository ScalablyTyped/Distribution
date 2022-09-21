package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the property to lookup. Format: properties/{property_id\} Example: "properties/1000"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesGet {
  
  inline def apply(): ParamsResourcePropertiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesGet]
  }
  
  extension [Self <: ParamsResourcePropertiesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
