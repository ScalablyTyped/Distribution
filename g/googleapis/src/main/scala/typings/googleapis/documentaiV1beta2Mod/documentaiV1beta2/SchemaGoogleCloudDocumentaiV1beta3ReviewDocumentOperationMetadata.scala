package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ReviewDocumentOperationMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3CommonOperationMetadata] = js.undefined
  
  /**
    * The creation time of the operation.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Crowd Compute question ID.
    */
  var questionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used only when Operation.done is false.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message providing more details about the current state of processing. For example, the error message if the operation is failed.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last update time of the operation.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ReviewDocumentOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ReviewDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ReviewDocumentOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ReviewDocumentOperationMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiV1beta3CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setQuestionId(value: String): Self = StObject.set(x, "questionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdNull: Self = StObject.set(x, "questionId", null)
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "questionId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
