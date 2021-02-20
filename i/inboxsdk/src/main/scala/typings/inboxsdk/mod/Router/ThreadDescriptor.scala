package typings.inboxsdk.mod.Router

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadDescriptor extends StObject {
  
  var gmailThreadId: js.UndefOr[String] = js.native
  
  var rfcMessageId: js.UndefOr[String] = js.native
}
object ThreadDescriptor {
  
  @scala.inline
  def apply(): ThreadDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadDescriptor]
  }
  
  @scala.inline
  implicit class ThreadDescriptorMutableBuilder[Self <: ThreadDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGmailThreadId(value: String): Self = StObject.set(x, "gmailThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGmailThreadIdUndefined: Self = StObject.set(x, "gmailThreadId", js.undefined)
    
    @scala.inline
    def setRfcMessageId(value: String): Self = StObject.set(x, "rfcMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRfcMessageIdUndefined: Self = StObject.set(x, "rfcMessageId", js.undefined)
  }
}
