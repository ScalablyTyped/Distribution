package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEventPayload extends StObject {
  
  var payload: js.UndefOr[js.Object] = js.native
  
  var `type`: Messages = js.native
}
object MessageEventPayload {
  
  @scala.inline
  def apply(`type`: Messages): MessageEventPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventPayload]
  }
  
  @scala.inline
  implicit class MessageEventPayloadMutableBuilder[Self <: MessageEventPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setType(value: Messages): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
