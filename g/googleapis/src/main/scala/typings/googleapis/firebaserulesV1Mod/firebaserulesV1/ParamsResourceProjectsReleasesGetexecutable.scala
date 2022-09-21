package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsReleasesGetexecutable
  extends StObject
     with StandardParameters {
  
  /**
    * The requested runtime executable version. Defaults to FIREBASE_RULES_EXECUTABLE_V1.
    */
  var executableVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the `Release`. Format: `projects/{project_id\}/releases/{release_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsReleasesGetexecutable {
  
  inline def apply(): ParamsResourceProjectsReleasesGetexecutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReleasesGetexecutable]
  }
  
  extension [Self <: ParamsResourceProjectsReleasesGetexecutable](x: Self) {
    
    inline def setExecutableVersion(value: String): Self = StObject.set(x, "executableVersion", value.asInstanceOf[js.Any])
    
    inline def setExecutableVersionUndefined: Self = StObject.set(x, "executableVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
