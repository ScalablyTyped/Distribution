package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSmtpEvent extends StObject {
  
  /** the SMTP response from the recipient's server */
  var diag: String
  
  /** the Unix timestamp when the event occurred */
  var ts: Double
  
  /** the message's state as a result of this event */
  var `type`: String
}
object MessageSmtpEvent {
  
  inline def apply(diag: String, ts: Double, `type`: String): MessageSmtpEvent = {
    val __obj = js.Dynamic.literal(diag = diag.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSmtpEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageSmtpEvent] (val x: Self) extends AnyVal {
    
    inline def setDiag(value: String): Self = StObject.set(x, "diag", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
