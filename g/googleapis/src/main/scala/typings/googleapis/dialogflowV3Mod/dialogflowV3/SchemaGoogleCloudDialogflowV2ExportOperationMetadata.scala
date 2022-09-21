package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ExportOperationMetadata extends StObject {
  
  /**
    * Cloud Storage file path of the exported data.
    */
  var exportedGcsDestination: js.UndefOr[SchemaGoogleCloudDialogflowV2GcsDestination] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ExportOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ExportOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ExportOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ExportOperationMetadata](x: Self) {
    
    inline def setExportedGcsDestination(value: SchemaGoogleCloudDialogflowV2GcsDestination): Self = StObject.set(x, "exportedGcsDestination", value.asInstanceOf[js.Any])
    
    inline def setExportedGcsDestinationUndefined: Self = StObject.set(x, "exportedGcsDestination", js.undefined)
  }
}
