package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent project resource where the model is to be created. The parent must have the form `projects/{project_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaModel] = js.undefined
}
object ParamsResourceProjectsModelsCreate {
  
  inline def apply(): ParamsResourceProjectsModelsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsModelsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaModel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
