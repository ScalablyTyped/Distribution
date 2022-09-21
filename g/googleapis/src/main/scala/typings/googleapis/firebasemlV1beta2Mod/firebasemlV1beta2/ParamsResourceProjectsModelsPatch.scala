package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The resource name of the Model. Model names have the form `projects/{project_id\}/models/{model_id\}` The name is ignored when creating a model.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaModel] = js.undefined
  
  /**
    * The update mask
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsPatch {
  
  inline def apply(): ParamsResourceProjectsModelsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsModelsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaModel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
