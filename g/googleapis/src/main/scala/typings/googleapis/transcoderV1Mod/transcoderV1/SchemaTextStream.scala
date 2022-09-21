package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextStream extends StObject {
  
  /**
    * The codec for this text stream. The default is `webvtt`. Supported text codecs: - `srt` - `ttml` - `cea608` - `cea708` - `webvtt`
    */
  var codec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
    */
  var mapping: js.UndefOr[js.Array[SchemaTextMapping]] = js.undefined
}
object SchemaTextStream {
  
  inline def apply(): SchemaTextStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextStream]
  }
  
  extension [Self <: SchemaTextStream](x: Self) {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecNull: Self = StObject.set(x, "codec", null)
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setMapping(value: js.Array[SchemaTextMapping]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: SchemaTextMapping*): Self = StObject.set(x, "mapping", js.Array(value*))
  }
}
