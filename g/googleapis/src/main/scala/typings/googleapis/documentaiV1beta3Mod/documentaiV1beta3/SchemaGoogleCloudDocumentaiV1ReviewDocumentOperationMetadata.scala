package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1ReviewDocumentOperationMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiV1CommonOperationMetadata] = js.undefined
  
  /**
    * The Crowd Compute question ID.
    */
  var questionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1ReviewDocumentOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1ReviewDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1ReviewDocumentOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1ReviewDocumentOperationMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiV1CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
    
    inline def setQuestionId(value: String): Self = StObject.set(x, "questionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdNull: Self = StObject.set(x, "questionId", null)
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "questionId", js.undefined)
  }
}
