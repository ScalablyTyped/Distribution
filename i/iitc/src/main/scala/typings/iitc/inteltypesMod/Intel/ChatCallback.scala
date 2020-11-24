package typings.iitc.inteltypesMod.Intel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// CHAT
@js.native
trait ChatCallback extends js.Object {
  
  var result: js.Array[ChatLine] = js.native
}
object ChatCallback {
  
  @scala.inline
  def apply(result: js.Array[ChatLine]): ChatCallback = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatCallback]
  }
  
  @scala.inline
  implicit class ChatCallbackOps[Self <: ChatCallback] (val x: Self) extends AnyVal {
    
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
    def setResultVarargs(value: ChatLine*): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[ChatLine]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
