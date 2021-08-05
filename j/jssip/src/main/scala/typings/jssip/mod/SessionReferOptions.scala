package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionReferOptions extends StObject {
  
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var replaces: js.UndefOr[RTCSession] = js.undefined
}
object SessionReferOptions {
  
  inline def apply(): SessionReferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionReferOptions]
  }
  
  extension [Self <: SessionReferOptions](x: Self) {
    
    inline def setEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    inline def setReplaces(value: RTCSession): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
  }
}
