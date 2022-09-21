package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3CreateDocumentOperationMetadata extends StObject {
  
  /**
    * The generic information of the operation.
    */
  var genericMetadata: js.UndefOr[SchemaGoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3CreateDocumentOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3CreateDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3CreateDocumentOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3CreateDocumentOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: SchemaGoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}
