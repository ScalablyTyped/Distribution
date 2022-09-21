package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConfigurationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the configuration to retrieve. For Cloud Run (fully managed), replace {namespace_id\} with the project ID or number.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConfigurationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsConfigurationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConfigurationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConfigurationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
