package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Environment. Format: `projects//locations//agents//environments//experiments/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsEnvironmentsExperimentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
