package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV3alpha1CreateDocumentOperationMetadata extends StObject {
  
  /**
    * The generic information of the operation.
    */
  var genericMetadata: js.UndefOr[SchemaGoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDialogflowV3alpha1CreateDocumentOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV3alpha1CreateDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV3alpha1CreateDocumentOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV3alpha1CreateDocumentOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: SchemaGoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}
