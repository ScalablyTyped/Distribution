package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsExecutionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `projects/{project_id\}/locations/{location\}/executions/{execution_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsExecutionsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsExecutionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsExecutionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsExecutionsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
