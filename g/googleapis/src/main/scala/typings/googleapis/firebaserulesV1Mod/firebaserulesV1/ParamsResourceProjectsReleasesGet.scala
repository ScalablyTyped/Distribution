package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsReleasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the `Release`. Format: `projects/{project_id\}/releases/{release_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsReleasesGet {
  
  inline def apply(): ParamsResourceProjectsReleasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReleasesGet]
  }
  
  extension [Self <: ParamsResourceProjectsReleasesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
