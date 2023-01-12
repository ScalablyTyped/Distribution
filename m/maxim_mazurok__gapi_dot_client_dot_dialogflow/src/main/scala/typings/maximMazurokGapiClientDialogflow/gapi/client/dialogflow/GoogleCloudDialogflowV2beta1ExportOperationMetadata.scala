package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1ExportOperationMetadata extends StObject {
  
  /** Cloud Storage file path of the exported data. */
  var exportedGcsDestination: js.UndefOr[GoogleCloudDialogflowV2beta1GcsDestination] = js.undefined
}
object GoogleCloudDialogflowV2beta1ExportOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2beta1ExportOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1ExportOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1ExportOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setExportedGcsDestination(value: GoogleCloudDialogflowV2beta1GcsDestination): Self = StObject.set(x, "exportedGcsDestination", value.asInstanceOf[js.Any])
    
    inline def setExportedGcsDestinationUndefined: Self = StObject.set(x, "exportedGcsDestination", js.undefined)
  }
}
