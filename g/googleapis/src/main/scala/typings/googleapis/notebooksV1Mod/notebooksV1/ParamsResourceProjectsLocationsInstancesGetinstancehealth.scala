package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesGetinstancehealth
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesGetinstancehealth {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesGetinstancehealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesGetinstancehealth]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesGetinstancehealth](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
