package typings.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedProtocolError
  extends StdError
     with GotError {
  @JSName("name")
  var name_UnsupportedProtocolError: typings.got.gotStrings.UnsupportedProtocolError = js.native
}

object UnsupportedProtocolError {
  @scala.inline
  def apply(message: String, name: typings.got.gotStrings.UnsupportedProtocolError): UnsupportedProtocolError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedProtocolError]
  }
  @scala.inline
  implicit class UnsupportedProtocolErrorOps[Self <: UnsupportedProtocolError] (val x: Self) extends AnyVal {
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
    def setName(value: typings.got.gotStrings.UnsupportedProtocolError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

