package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the location to fetch.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Read mask to specify what fields will be returned in the response.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGet {
  
  inline def apply(): ParamsResourceLocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGet]
  }
  
  extension [Self <: ParamsResourceLocationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
