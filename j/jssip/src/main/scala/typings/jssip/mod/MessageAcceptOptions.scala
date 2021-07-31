package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageAcceptOptions extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}
object MessageAcceptOptions {
  
  @scala.inline
  def apply(): MessageAcceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageAcceptOptions]
  }
  
  @scala.inline
  implicit class MessageAcceptOptionsMutableBuilder[Self <: MessageAcceptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
  }
}
