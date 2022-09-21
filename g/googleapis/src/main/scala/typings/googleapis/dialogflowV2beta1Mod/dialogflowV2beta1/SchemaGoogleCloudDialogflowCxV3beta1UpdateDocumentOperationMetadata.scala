package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1UpdateDocumentOperationMetadata extends StObject {
  
  /**
    * The generic information of the operation.
    */
  var genericMetadata: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1UpdateDocumentOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1UpdateDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1UpdateDocumentOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1UpdateDocumentOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: SchemaGoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}
