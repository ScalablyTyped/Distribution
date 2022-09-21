package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsDebugtokensDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the DebugToken to delete, in the format: ``` projects/{project_number\}/apps/{app_id\}/debugTokens/{debug_token_id\} ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsDebugtokensDelete {
  
  inline def apply(): ParamsResourceProjectsAppsDebugtokensDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsDebugtokensDelete]
  }
  
  extension [Self <: ParamsResourceProjectsAppsDebugtokensDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
