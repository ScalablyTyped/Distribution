package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEnvironmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the environment to get, in the form: "projects/{projectId\}/locations/{locationId\}/environments/{environmentId\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEnvironmentsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsEnvironmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEnvironmentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEnvironmentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
