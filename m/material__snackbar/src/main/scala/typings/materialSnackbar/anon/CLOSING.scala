package typings.materialSnackbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLOSING extends js.Object {
  var CLOSING: String = js.native
  var OPEN: String = js.native
  var OPENING: String = js.native
}

object CLOSING {
  @scala.inline
  def apply(CLOSING: String, OPEN: String, OPENING: String): CLOSING = {
    val __obj = js.Dynamic.literal(CLOSING = CLOSING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLOSING]
  }
  @scala.inline
  implicit class CLOSINGOps[Self <: CLOSING] (val x: Self) extends AnyVal {
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
    def setCLOSING(value: String): Self = this.set("CLOSING", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN(value: String): Self = this.set("OPEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPENING(value: String): Self = this.set("OPENING", value.asInstanceOf[js.Any])
  }
  
}

