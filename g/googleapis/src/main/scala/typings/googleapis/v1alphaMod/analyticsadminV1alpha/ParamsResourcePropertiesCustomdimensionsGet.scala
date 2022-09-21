package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesCustomdimensionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the CustomDimension to get. Example format: properties/1234/customDimensions/5678
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesCustomdimensionsGet {
  
  inline def apply(): ParamsResourcePropertiesCustomdimensionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesCustomdimensionsGet]
  }
  
  extension [Self <: ParamsResourcePropertiesCustomdimensionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
