package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1BatchDocumentsInputConfig extends StObject {
  
  /**
    * The set of documents individually specified on Cloud Storage.
    */
  var gcsDocuments: js.UndefOr[SchemaGoogleCloudDocumentaiV1GcsDocuments] = js.undefined
  
  /**
    * The set of documents that match the specified Cloud Storage [gcs_prefix].
    */
  var gcsPrefix: js.UndefOr[SchemaGoogleCloudDocumentaiV1GcsPrefix] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1BatchDocumentsInputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1BatchDocumentsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1BatchDocumentsInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1BatchDocumentsInputConfig](x: Self) {
    
    inline def setGcsDocuments(value: SchemaGoogleCloudDocumentaiV1GcsDocuments): Self = StObject.set(x, "gcsDocuments", value.asInstanceOf[js.Any])
    
    inline def setGcsDocumentsUndefined: Self = StObject.set(x, "gcsDocuments", js.undefined)
    
    inline def setGcsPrefix(value: SchemaGoogleCloudDocumentaiV1GcsPrefix): Self = StObject.set(x, "gcsPrefix", value.asInstanceOf[js.Any])
    
    inline def setGcsPrefixUndefined: Self = StObject.set(x, "gcsPrefix", js.undefined)
  }
}
