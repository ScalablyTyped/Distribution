package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsSafetynetconfigGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the SafetyNetConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/safetyNetConfig ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsSafetynetconfigGet {
  
  inline def apply(): ParamsResourceProjectsAppsSafetynetconfigGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsSafetynetconfigGet]
  }
  
  extension [Self <: ParamsResourceProjectsAppsSafetynetconfigGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
