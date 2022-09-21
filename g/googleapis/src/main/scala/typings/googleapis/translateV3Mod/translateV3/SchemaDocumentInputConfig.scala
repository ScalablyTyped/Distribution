package typings.googleapis.translateV3Mod.translateV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentInputConfig extends StObject {
  
  /**
    * Document's content represented as a stream of bytes.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google Cloud Storage location. This must be a single file. For example: gs://example_bucket/example_file.pdf
    */
  var gcsSource: js.UndefOr[SchemaGcsSource] = js.undefined
  
  /**
    * Specifies the input document's mime_type. If not specified it will be determined using the file extension for gcs_source provided files. For a file provided through bytes content the mime_type must be provided. Currently supported mime types are: - application/pdf - application/vnd.openxmlformats-officedocument.wordprocessingml.document - application/vnd.openxmlformats-officedocument.presentationml.presentation - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDocumentInputConfig {
  
  inline def apply(): SchemaDocumentInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentInputConfig]
  }
  
  extension [Self <: SchemaDocumentInputConfig](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsSource(value: SchemaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
