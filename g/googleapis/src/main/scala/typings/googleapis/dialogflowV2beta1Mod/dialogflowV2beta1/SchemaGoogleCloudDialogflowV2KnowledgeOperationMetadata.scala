package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2KnowledgeOperationMetadata extends StObject {
  
  /**
    * Metadata for the Export Data Operation such as the destination of export.
    */
  var exportOperationMetadata: js.UndefOr[SchemaGoogleCloudDialogflowV2ExportOperationMetadata] = js.undefined
  
  /**
    * The name of the knowledge base interacted with during the operation.
    */
  var knowledgeBase: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state of this operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2KnowledgeOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2KnowledgeOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2KnowledgeOperationMetadata](x: Self) {
    
    inline def setExportOperationMetadata(value: SchemaGoogleCloudDialogflowV2ExportOperationMetadata): Self = StObject.set(x, "exportOperationMetadata", value.asInstanceOf[js.Any])
    
    inline def setExportOperationMetadataUndefined: Self = StObject.set(x, "exportOperationMetadata", js.undefined)
    
    inline def setKnowledgeBase(value: String): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseNull: Self = StObject.set(x, "knowledgeBase", null)
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
