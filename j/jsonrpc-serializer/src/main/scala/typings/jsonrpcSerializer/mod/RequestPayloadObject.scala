package typings.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPayloadObject extends PayloadObject {
  @JSName("id")
  var id_RequestPayloadObject: String = js.native
  @JSName("method")
  var method_RequestPayloadObject: String = js.native
}

object RequestPayloadObject {
  @scala.inline
  def apply(id: String, method: String): RequestPayloadObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPayloadObject]
  }
  @scala.inline
  implicit class RequestPayloadObjectOps[Self <: RequestPayloadObject] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

