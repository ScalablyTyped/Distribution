package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSynthesisInput extends StObject {
  
  /**
    * The SSML document to be synthesized. The SSML document must be valid and well-formed. Otherwise the RPC will fail and return google.rpc.Code.INVALID_ARGUMENT. For more information, see [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
    */
  var ssml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaSynthesisInput {
  
  inline def apply(): SchemaSynthesisInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSynthesisInput]
  }
  
  extension [Self <: SchemaSynthesisInput](x: Self) {
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlNull: Self = StObject.set(x, "ssml", null)
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
