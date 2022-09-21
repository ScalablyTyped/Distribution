package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsDebugtokensGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the debug token, in the format: ``` projects/{project_number\}/apps/{app_id\}/debugTokens/{debug_token_id\} ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsDebugtokensGet {
  
  inline def apply(): ParamsResourceProjectsAppsDebugtokensGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsDebugtokensGet]
  }
  
  extension [Self <: ParamsResourceProjectsAppsDebugtokensGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
