package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ExportOperationMetadata extends StObject {
  
  /**
    * Cloud Storage file path of the exported data.
    */
  var exportedGcsDestination: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1GcsDestination] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ExportOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ExportOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ExportOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ExportOperationMetadata](x: Self) {
    
    inline def setExportedGcsDestination(value: SchemaGoogleCloudDialogflowV2beta1GcsDestination): Self = StObject.set(x, "exportedGcsDestination", value.asInstanceOf[js.Any])
    
    inline def setExportedGcsDestinationUndefined: Self = StObject.set(x, "exportedGcsDestination", js.undefined)
  }
}
