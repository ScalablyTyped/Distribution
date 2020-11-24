package typings.highlightJs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackResponse extends js.Object {
  
  var data: Record[String, _] = js.native
  
  def ignoreMatch(): Unit = js.native
}
object CallbackResponse {
  
  @scala.inline
  def apply(data: Record[String, _], ignoreMatch: () => Unit): CallbackResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ignoreMatch = js.Any.fromFunction0(ignoreMatch))
    __obj.asInstanceOf[CallbackResponse]
  }
  
  @scala.inline
  implicit class CallbackResponseOps[Self <: CallbackResponse] (val x: Self) extends AnyVal {
    
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
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreMatch(value: () => Unit): Self = this.set("ignoreMatch", js.Any.fromFunction0(value))
  }
}
