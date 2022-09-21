package typings.googleapis.firebasemlV1beta2Mod.firebasemlV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModel extends StObject {
  
  /**
    * Output only. Lists operation ids associated with this model whose status is NOT done.
    */
  var activeOperations: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
  
  /**
    * Output only. Timestamp when this model was created in Firebase ML.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. See RFC7232 https://tools.ietf.org/html/rfc7232#section-2.3
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The model_hash will change if a new file is available for download.
    */
  var modelHash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the Model. Model names have the form `projects/{project_id\}/models/{model_id\}` The name is ignored when creating a model.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State common to all model types. Includes publishing and validation information.
    */
  var state: js.UndefOr[SchemaModelState] = js.undefined
  
  /**
    * User defined tags which can be used to group/filter models during listing
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A TFLite Model
    */
  var tfliteModel: js.UndefOr[SchemaTfLiteModel] = js.undefined
  
  /**
    * Output only. Timestamp when this model was updated in Firebase ML.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaModel {
  
  inline def apply(): SchemaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModel]
  }
  
  extension [Self <: SchemaModel](x: Self) {
    
    inline def setActiveOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "activeOperations", value.asInstanceOf[js.Any])
    
    inline def setActiveOperationsUndefined: Self = StObject.set(x, "activeOperations", js.undefined)
    
    inline def setActiveOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "activeOperations", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setModelHash(value: String): Self = StObject.set(x, "modelHash", value.asInstanceOf[js.Any])
    
    inline def setModelHashNull: Self = StObject.set(x, "modelHash", null)
    
    inline def setModelHashUndefined: Self = StObject.set(x, "modelHash", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: SchemaModelState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTfliteModel(value: SchemaTfLiteModel): Self = StObject.set(x, "tfliteModel", value.asInstanceOf[js.Any])
    
    inline def setTfliteModelUndefined: Self = StObject.set(x, "tfliteModel", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
