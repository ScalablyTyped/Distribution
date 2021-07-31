package typings.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentSendMessageOptions extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}
object UserAgentSendMessageOptions {
  
  @scala.inline
  def apply(): UserAgentSendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentSendMessageOptions]
  }
  
  @scala.inline
  implicit class UserAgentSendMessageOptionsMutableBuilder[Self <: UserAgentSendMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
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
  }
}
