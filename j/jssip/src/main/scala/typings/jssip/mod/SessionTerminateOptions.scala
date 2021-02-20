package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionTerminateOptions extends StObject {
  
  var body: js.UndefOr[String] = js.native
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var reason_phrase: js.UndefOr[String] = js.native
  
  var status_code: js.UndefOr[Double] = js.native
}
object SessionTerminateOptions {
  
  @scala.inline
  def apply(): SessionTerminateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTerminateOptions]
  }
  
  @scala.inline
  implicit class SessionTerminateOptionsMutableBuilder[Self <: SessionTerminateOptions] (val x: Self) extends AnyVal {
    
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
    def setReason_phraseUndefined: Self = StObject.set(x, "reason_phrase", js.undefined)
    
    @scala.inline
    def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
  }
}
