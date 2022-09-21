package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUiv1beta3ProjectsLocationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name for the location.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceUiv1beta3ProjectsLocationsGet {
  
  inline def apply(): ParamsResourceUiv1beta3ProjectsLocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUiv1beta3ProjectsLocationsGet]
  }
  
  extension [Self <: ParamsResourceUiv1beta3ProjectsLocationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
