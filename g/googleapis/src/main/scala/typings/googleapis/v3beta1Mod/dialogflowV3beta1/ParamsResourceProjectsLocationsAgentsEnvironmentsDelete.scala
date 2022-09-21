package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsEnvironmentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Environment to delete. Format: `projects//locations//agents//environments/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsEnvironmentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsEnvironmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsEnvironmentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsEnvironmentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
