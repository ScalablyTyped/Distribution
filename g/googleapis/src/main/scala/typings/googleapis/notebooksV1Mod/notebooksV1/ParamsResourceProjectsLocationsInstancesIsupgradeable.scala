package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesIsupgradeable
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    */
  var notebookInstance: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesIsupgradeable {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesIsupgradeable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesIsupgradeable]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesIsupgradeable](x: Self) {
    
    inline def setNotebookInstance(value: String): Self = StObject.set(x, "notebookInstance", value.asInstanceOf[js.Any])
    
    inline def setNotebookInstanceUndefined: Self = StObject.set(x, "notebookInstance", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
