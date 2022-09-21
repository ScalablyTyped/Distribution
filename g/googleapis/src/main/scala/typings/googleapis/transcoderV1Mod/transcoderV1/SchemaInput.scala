package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInput extends StObject {
  
  /**
    * A unique key for this input. Must be specified when using advanced mapping and edit lists.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Preprocessing configurations.
    */
  var preprocessingConfig: js.UndefOr[SchemaPreprocessingConfig] = js.undefined
  
  /**
    * URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`). If empty, the value is populated from `Job.input_uri`. See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaInput {
  
  inline def apply(): SchemaInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInput]
  }
  
  extension [Self <: SchemaInput](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPreprocessingConfig(value: SchemaPreprocessingConfig): Self = StObject.set(x, "preprocessingConfig", value.asInstanceOf[js.Any])
    
    inline def setPreprocessingConfigUndefined: Self = StObject.set(x, "preprocessingConfig", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
