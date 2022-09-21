package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTranscriptOutputConfig extends StObject {
  
  /**
    * Specifies a Cloud Storage URI for the recognition results. Must be specified in the format: `gs://bucket_name/object_name`, and the bucket must already exist.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaTranscriptOutputConfig {
  
  inline def apply(): SchemaTranscriptOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranscriptOutputConfig]
  }
  
  extension [Self <: SchemaTranscriptOutputConfig](x: Self) {
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
