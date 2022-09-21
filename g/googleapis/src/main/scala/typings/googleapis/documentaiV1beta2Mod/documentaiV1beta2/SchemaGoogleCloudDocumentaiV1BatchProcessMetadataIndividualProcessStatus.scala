package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1BatchProcessMetadataIndividualProcessStatus extends StObject {
  
  /**
    * The status of human review on the processed document.
    */
  var humanReviewStatus: js.UndefOr[SchemaGoogleCloudDocumentaiV1HumanReviewStatus] = js.undefined
  
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
object SchemaGoogleCloudDocumentaiV1BatchProcessMetadataIndividualProcessStatus {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1BatchProcessMetadataIndividualProcessStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1BatchProcessMetadataIndividualProcessStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1BatchProcessMetadataIndividualProcessStatus](x: Self) {
    
    inline def setHumanReviewStatus(value: SchemaGoogleCloudDocumentaiV1HumanReviewStatus): Self = StObject.set(x, "humanReviewStatus", value.asInstanceOf[js.Any])
    
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
