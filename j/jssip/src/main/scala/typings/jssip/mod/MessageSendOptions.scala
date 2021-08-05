package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSendOptions extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}
object MessageSendOptions {
  
  inline def apply(): MessageSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSendOptions]
  }
  
  extension [Self <: MessageSendOptions](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
  }
}
