package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult extends StObject {
  
  /**
    * The source Cloud Storage URI specified in the import config.
    */
  var inputGcsSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The validation status of import config.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ImportDocumentsMetadataImportConfigValidationResult](x: Self) {
    
    inline def setInputGcsSource(value: String): Self = StObject.set(x, "inputGcsSource", value.asInstanceOf[js.Any])
    
    inline def setInputGcsSourceNull: Self = StObject.set(x, "inputGcsSource", null)
    
    inline def setInputGcsSourceUndefined: Self = StObject.set(x, "inputGcsSource", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
