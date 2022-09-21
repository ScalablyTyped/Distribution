package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name for the location.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGet {
  
  inline def apply(): ParamsResourceLocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGet]
  }
  
  extension [Self <: ParamsResourceLocationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
