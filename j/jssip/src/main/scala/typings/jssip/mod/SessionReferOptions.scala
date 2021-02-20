package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionReferOptions extends StObject {
  
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.native
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var replaces: js.UndefOr[RTCSession] = js.native
}
object SessionReferOptions {
  
  @scala.inline
  def apply(): SessionReferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionReferOptions]
  }
  
  @scala.inline
  implicit class SessionReferOptionsMutableBuilder[Self <: SessionReferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    @scala.inline
    def setReplaces(value: RTCSession): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
  }
}
