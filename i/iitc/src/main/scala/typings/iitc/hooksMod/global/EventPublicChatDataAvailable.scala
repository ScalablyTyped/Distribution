package typings.iitc.hooksMod.global

import typings.iitc.inteltypesMod.Intel.ChatLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPublicChatDataAvailable extends js.Object {
  
  var processed: js.Any = js.native
  
  var raw: js.Any = js.native
  
  var result: js.Array[ChatLine] = js.native
}
object EventPublicChatDataAvailable {
  
  @scala.inline
  def apply(processed: js.Any, raw: js.Any, result: js.Array[ChatLine]): EventPublicChatDataAvailable = {
    val __obj = js.Dynamic.literal(processed = processed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPublicChatDataAvailable]
  }
  
  @scala.inline
  implicit class EventPublicChatDataAvailableOps[Self <: EventPublicChatDataAvailable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessed(value: js.Any): Self = this.set("processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: ChatLine*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[ChatLine]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
