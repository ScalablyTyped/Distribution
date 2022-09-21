package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextStream extends StObject {
  
  /**
    * The codec for this text stream. The default is `"webvtt"`. Supported text codecs: - 'srt' - 'ttml' - 'cea608' - 'cea708' - 'webvtt'
    */
  var codec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The BCP-47 language code, such as `"en-US"` or `"sr-Latn"`. For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
    */
  var mapping: js.UndefOr[js.Array[SchemaTextAtom]] = js.undefined
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
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMapping(value: js.Array[SchemaTextAtom]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMappingVarargs(value: SchemaTextAtom*): Self = StObject.set(x, "mapping", js.Array(value*))
  }
}
