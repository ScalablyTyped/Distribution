package typings.heremaps.H.service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @property id {number} - the ID associated internally with this request
  * @property cancel {function()} - this function cancels the request and invokes the errback function
  */
@js.native
trait JsonpRequestHandle extends js.Object {
  
  def cancel(): Unit = js.native
  
  var id: Double = js.native
}
object JsonpRequestHandle {
  
  @scala.inline
  def apply(cancel: () => Unit, id: Double): JsonpRequestHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpRequestHandle]
  }
  
  @scala.inline
  implicit class JsonpRequestHandleOps[Self <: JsonpRequestHandle] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
