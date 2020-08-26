package typings.jqueryPnotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Closer extends js.Object {
  var closer: js.UndefOr[String] = js.native
  var pin_down: js.UndefOr[String] = js.native
  var pin_up: js.UndefOr[String] = js.native
}

object Closer {
  @scala.inline
  def apply(): Closer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closer]
  }
  @scala.inline
  implicit class CloserOps[Self <: Closer] (val x: Self) extends AnyVal {
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
    def setCloser(value: String): Self = this.set("closer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloser: Self = this.set("closer", js.undefined)
    @scala.inline
    def setPin_down(value: String): Self = this.set("pin_down", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePin_down: Self = this.set("pin_down", js.undefined)
    @scala.inline
    def setPin_up(value: String): Self = this.set("pin_up", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePin_up: Self = this.set("pin_up", js.undefined)
  }
  
}

