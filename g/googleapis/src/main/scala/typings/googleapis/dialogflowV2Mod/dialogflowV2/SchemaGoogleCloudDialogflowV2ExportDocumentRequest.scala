package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ExportDocumentRequest extends StObject {
  
  /**
    * When enabled, export the full content of the document including empirical probability.
    */
  var exportFullContent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Cloud Storage file path to export the document.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudDialogflowV2GcsDestination] = js.undefined
  
  /**
    * When enabled, export the smart messaging allowlist document for partial update.
    */
  var smartMessagingPartialUpdate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ExportDocumentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ExportDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ExportDocumentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ExportDocumentRequest](x: Self) {
    
    inline def setExportFullContent(value: Boolean): Self = StObject.set(x, "exportFullContent", value.asInstanceOf[js.Any])
    
    inline def setExportFullContentNull: Self = StObject.set(x, "exportFullContent", null)
    
    inline def setExportFullContentUndefined: Self = StObject.set(x, "exportFullContent", js.undefined)
    
    inline def setGcsDestination(value: SchemaGoogleCloudDialogflowV2GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def setSmartMessagingPartialUpdate(value: Boolean): Self = StObject.set(x, "smartMessagingPartialUpdate", value.asInstanceOf[js.Any])
    
    inline def setSmartMessagingPartialUpdateNull: Self = StObject.set(x, "smartMessagingPartialUpdate", null)
    
    inline def setSmartMessagingPartialUpdateUndefined: Self = StObject.set(x, "smartMessagingPartialUpdate", js.undefined)
  }
}
