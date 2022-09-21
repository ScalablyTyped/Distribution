package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsVersionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the version. You can get the names of all the versions of a model by calling projects.models.versions.list.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsVersionsDelete {
  
  inline def apply(): ParamsResourceProjectsModelsVersionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsVersionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsModelsVersionsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
