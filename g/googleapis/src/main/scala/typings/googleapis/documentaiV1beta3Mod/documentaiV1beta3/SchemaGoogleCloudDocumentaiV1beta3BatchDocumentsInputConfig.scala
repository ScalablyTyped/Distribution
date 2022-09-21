package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3BatchDocumentsInputConfig extends StObject {
  
  /**
    * The set of documents individually specified on Cloud Storage.
    */
  var gcsDocuments: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3GcsDocuments] = js.undefined
  
  /**
    * The set of documents that match the specified Cloud Storage [gcs_prefix].
    */
  var gcsPrefix: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3GcsPrefix] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3BatchDocumentsInputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3BatchDocumentsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3BatchDocumentsInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3BatchDocumentsInputConfig](x: Self) {
    
    inline def setGcsDocuments(value: SchemaGoogleCloudDocumentaiV1beta3GcsDocuments): Self = StObject.set(x, "gcsDocuments", value.asInstanceOf[js.Any])
    
    inline def setGcsDocumentsUndefined: Self = StObject.set(x, "gcsDocuments", js.undefined)
    
    inline def setGcsPrefix(value: SchemaGoogleCloudDocumentaiV1beta3GcsPrefix): Self = StObject.set(x, "gcsPrefix", value.asInstanceOf[js.Any])
    
    inline def setGcsPrefixUndefined: Self = StObject.set(x, "gcsPrefix", js.undefined)
  }
}
