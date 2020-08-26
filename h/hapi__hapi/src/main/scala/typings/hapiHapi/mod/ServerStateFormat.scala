package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerStateFormat extends js.Object {
  var name: String = js.native
  var options: ServerStateCookieOptions = js.native
  var value: String = js.native
}

object ServerStateFormat {
  @scala.inline
  def apply(name: String, options: ServerStateCookieOptions, value: String): ServerStateFormat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerStateFormat]
  }
  @scala.inline
  implicit class ServerStateFormatOps[Self <: ServerStateFormat] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: ServerStateCookieOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

