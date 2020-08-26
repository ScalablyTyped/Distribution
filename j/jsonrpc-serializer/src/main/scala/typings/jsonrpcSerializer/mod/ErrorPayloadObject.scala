package typings.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorPayloadObject extends PayloadObject {
  @JSName("error")
  var error_ErrorPayloadObject: SerializerError = js.native
  @JSName("id")
  var id_ErrorPayloadObject: String | Double = js.native
}

object ErrorPayloadObject {
  @scala.inline
  def apply(error: SerializerError, id: String | Double): ErrorPayloadObject = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPayloadObject]
  }
  @scala.inline
  implicit class ErrorPayloadObjectOps[Self <: ErrorPayloadObject] (val x: Self) extends AnyVal {
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
    def setError(value: SerializerError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

