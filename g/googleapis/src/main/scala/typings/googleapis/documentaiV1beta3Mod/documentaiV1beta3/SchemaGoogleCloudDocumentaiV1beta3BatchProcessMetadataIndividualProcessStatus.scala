package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus extends StObject {
  
  /**
    * The name of the operation triggered by the processed document. If the human review process is not triggered, this field will be empty. It has the same response type and metadata as the long running operation returned by ReviewDocument method.
    */
  var humanReviewOperation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of human review on the processed document.
    */
  var humanReviewStatus: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3HumanReviewStatus] = js.undefined
  
  /**
    * The source of the document, same as the [input_gcs_source] field in the request when the batch process started. The batch process is started by take snapshot of that document, since a user can move or change that document during the process.
    */
  var inputGcsSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The output_gcs_destination (in the request as `output_gcs_destination`) of the processed document if it was successful, otherwise empty.
    */
  var outputGcsDestination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status processing the document.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3BatchProcessMetadataIndividualProcessStatus](x: Self) {
    
    inline def setHumanReviewOperation(value: String): Self = StObject.set(x, "humanReviewOperation", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewOperationNull: Self = StObject.set(x, "humanReviewOperation", null)
    
    inline def setHumanReviewOperationUndefined: Self = StObject.set(x, "humanReviewOperation", js.undefined)
    
    inline def setHumanReviewStatus(value: SchemaGoogleCloudDocumentaiV1beta3HumanReviewStatus): Self = StObject.set(x, "humanReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setHumanReviewStatusUndefined: Self = StObject.set(x, "humanReviewStatus", js.undefined)
    
    inline def setInputGcsSource(value: String): Self = StObject.set(x, "inputGcsSource", value.asInstanceOf[js.Any])
    
    inline def setInputGcsSourceNull: Self = StObject.set(x, "inputGcsSource", null)
    
    inline def setInputGcsSourceUndefined: Self = StObject.set(x, "inputGcsSource", js.undefined)
    
    inline def setOutputGcsDestination(value: String): Self = StObject.set(x, "outputGcsDestination", value.asInstanceOf[js.Any])
    
    inline def setOutputGcsDestinationNull: Self = StObject.set(x, "outputGcsDestination", null)
    
    inline def setOutputGcsDestinationUndefined: Self = StObject.set(x, "outputGcsDestination", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
