package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVoicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Recommended. [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If not specified, the API will return all supported voices. If specified, the ListVoices call will only return voices that can be used to synthesize this language_code. For example, if you specify `"en-NZ"`, all `"en-NZ"` voices will be returned. If you specify `"no"`, both `"no-\*"` (Norwegian) and `"nb-\*"` (Norwegian Bokmal) voices will be returned.
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceVoicesList {
  
  inline def apply(): ParamsResourceVoicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVoicesList]
  }
  
  extension [Self <: ParamsResourceVoicesList](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
