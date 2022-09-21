package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOutput extends StObject {
  
  /**
    * URI for the output file(s). For example, `gs://my-bucket/outputs/`. If empty, the value is populated from `Job.output_uri`. See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaOutput {
  
  inline def apply(): SchemaOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutput]
  }
  
  extension [Self <: SchemaOutput](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
