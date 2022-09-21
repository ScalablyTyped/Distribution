package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSpokesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the spoke resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSpokesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsSpokesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSpokesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSpokesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
