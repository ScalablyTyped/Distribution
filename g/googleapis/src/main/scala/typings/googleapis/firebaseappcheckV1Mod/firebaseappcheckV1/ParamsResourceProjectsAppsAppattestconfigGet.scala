package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsAppattestconfigGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the AppAttestConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/appAttestConfig ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsAppattestconfigGet {
  
  inline def apply(): ParamsResourceProjectsAppsAppattestconfigGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsAppattestconfigGet]
  }
  
  extension [Self <: ParamsResourceProjectsAppsAppattestconfigGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
