package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesInventoriesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. API resource name for inventory resource. Format: `projects/{project\}/locations/{location\}/instances/{instance\}/inventory` For `{project\}`, either `project-number` or `project-id` can be provided. For `{instance\}`, either Compute Engine `instance-id` or `instance-name` can be provided.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Inventory view indicating what information should be included in the inventory resource. If unspecified, the default view is BASIC.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesInventoriesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesInventoriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesInventoriesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesInventoriesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
