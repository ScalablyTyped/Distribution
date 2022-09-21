package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata extends StObject {
  
  /**
    * The generic information of the operation.
    */
  var genericMetadata: js.UndefOr[SchemaGoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: SchemaGoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}
