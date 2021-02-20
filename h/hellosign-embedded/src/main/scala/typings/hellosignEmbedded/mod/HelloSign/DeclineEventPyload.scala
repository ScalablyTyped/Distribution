package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclineEventPyload extends StObject {
  
  var reason: String = js.native
  
  var signatureId: String = js.native
}
object DeclineEventPyload {
  
  @scala.inline
  def apply(reason: String, signatureId: String): DeclineEventPyload = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], signatureId = signatureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineEventPyload]
  }
  
  @scala.inline
  implicit class DeclineEventPyloadMutableBuilder[Self <: DeclineEventPyload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
  }
}
