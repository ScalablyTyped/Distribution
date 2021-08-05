package typings.inboxsdk.mod.Router

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadDescriptor extends StObject {
  
  var gmailThreadId: js.UndefOr[String] = js.undefined
  
  var rfcMessageId: js.UndefOr[String] = js.undefined
}
object ThreadDescriptor {
  
  inline def apply(): ThreadDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadDescriptor]
  }
  
  extension [Self <: ThreadDescriptor](x: Self) {
    
    inline def setGmailThreadId(value: String): Self = StObject.set(x, "gmailThreadId", value.asInstanceOf[js.Any])
    
    inline def setGmailThreadIdUndefined: Self = StObject.set(x, "gmailThreadId", js.undefined)
    
    inline def setRfcMessageId(value: String): Self = StObject.set(x, "rfcMessageId", value.asInstanceOf[js.Any])
    
    inline def setRfcMessageIdUndefined: Self = StObject.set(x, "rfcMessageId", js.undefined)
  }
}
