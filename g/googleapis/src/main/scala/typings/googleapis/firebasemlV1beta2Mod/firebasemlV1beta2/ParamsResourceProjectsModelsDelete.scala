package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the model to delete. The name must have the form `projects/{project_id\}/models/{model_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsDelete {
  
  inline def apply(): ParamsResourceProjectsModelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsModelsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
