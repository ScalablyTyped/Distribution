package typings.iitc.hooksMod.global

import typings.iitc.inteltypesMod.Intel.ChatLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPublicChatDataAvailable extends StObject {
  
  var processed: Any
  
  var raw: Any
  
  var result: js.Array[ChatLine]
}
object EventPublicChatDataAvailable {
  
  inline def apply(processed: Any, raw: Any, result: js.Array[ChatLine]): EventPublicChatDataAvailable = {
    val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPublicChatDataAvailable]
  }
  
  extension [Self <: EventPublicChatDataAvailable](x: Self) {
    
    inline def setProcessed(value: Any): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[ChatLine]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: ChatLine*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
