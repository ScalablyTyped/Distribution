package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadError
  extends StdError
     with GotError {
  @JSName("name")
  var name_ReadError: typings.got.gotStrings.ReadError = js.native
}

object ReadError {
  @scala.inline
  def apply(message: String, name: typings.got.gotStrings.ReadError): ReadError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadError]
  }
  @scala.inline
  implicit class ReadErrorOps[Self <: ReadError] (val x: Self) extends AnyVal {
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
    def setName(value: typings.got.gotStrings.ReadError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

