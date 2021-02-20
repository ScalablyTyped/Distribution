package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageRejectOptions extends StObject {
  
  var body: js.UndefOr[String] = js.native
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var reason_phrase: String = js.native
  
  var status_code: js.UndefOr[js.Array[Double]] = js.native
}
object MessageRejectOptions {
  
  @scala.inline
  def apply(reason_phrase: String): MessageRejectOptions = {
    val __obj = js.Dynamic.literal(reason_phrase = reason_phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRejectOptions]
  }
  
  @scala.inline
  implicit class MessageRejectOptionsMutableBuilder[Self <: MessageRejectOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setReason_phrase(value: String): Self = StObject.set(x, "reason_phrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_code(value: js.Array[Double]): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
    
    @scala.inline
    def setStatus_codeVarargs(value: Double*): Self = StObject.set(x, "status_code", js.Array(value :_*))
  }
}
