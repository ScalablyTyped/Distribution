package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired input location and metadata.
  */
trait SchemaGoogleCloudVisionV1p4beta1InputConfig extends StObject {
  
  /**
    * File content, represented as a stream of bytes. Note: As with all `bytes`
    * fields, protobuffers use a pure binary representation, whereas JSON
    * representations use base64.  Currently, this field only works for
    * BatchAnnotateFiles requests. It does not work for AsyncBatchAnnotateFiles
    * requests.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The Google Cloud Storage location to read the input from.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1GcsSource] = js.undefined
  
  /**
    * The type of the file. Currently only &quot;application/pdf&quot; and
    * &quot;image/tiff&quot; are supported. Wildcards are not supported.
    */
  var mimeType: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1InputConfig {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1InputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1InputConfig](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudVisionV1p4beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
