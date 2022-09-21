package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus extends StObject {
  
  /**
    * The source Cloud Storage URI of the document.
    */
  var inputGcsSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The output_gcs_destination of the processed document if it was successful, otherwise empty.
    */
  var outputGcsDestination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of the importing of the document.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataIndividualImportStatus](x: Self) {
    
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
