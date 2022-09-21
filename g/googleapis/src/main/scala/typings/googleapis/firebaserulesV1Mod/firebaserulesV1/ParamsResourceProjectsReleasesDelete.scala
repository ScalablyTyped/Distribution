package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsReleasesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for the `Release` to delete. Format: `projects/{project_id\}/releases/{release_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsReleasesDelete {
  
  inline def apply(): ParamsResourceProjectsReleasesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReleasesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsReleasesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
