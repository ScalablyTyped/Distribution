package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVoicesResponse extends StObject {
  
  /**
    * The list of voices.
    */
  var voices: js.UndefOr[js.Array[SchemaVoice]] = js.undefined
}
object SchemaListVoicesResponse {
  
  inline def apply(): SchemaListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVoicesResponse]
  }
  
  extension [Self <: SchemaListVoicesResponse](x: Self) {
    
    inline def setVoices(value: js.Array[SchemaVoice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
    
    inline def setVoicesUndefined: Self = StObject.set(x, "voices", js.undefined)
    
    inline def setVoicesVarargs(value: SchemaVoice*): Self = StObject.set(x, "voices", js.Array(value*))
  }
}
