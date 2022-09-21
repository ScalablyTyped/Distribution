package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGetruntimeconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the form: `projects/x/locations/x/runtimeConfig`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGetruntimeconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsGetruntimeconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGetruntimeconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGetruntimeconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
