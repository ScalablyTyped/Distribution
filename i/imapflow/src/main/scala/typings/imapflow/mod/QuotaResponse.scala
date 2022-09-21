package typings.imapflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuotaResponse extends StObject {
  
  var messages: js.UndefOr[js.Object] = js.undefined
  
  var path: String
  
  var storage: js.UndefOr[js.Object] = js.undefined
}
object QuotaResponse {
  
  inline def apply(path: String): QuotaResponse = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaResponse]
  }
  
  extension [Self <: QuotaResponse](x: Self) {
    
    inline def setMessages(value: js.Object): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: js.Object): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
