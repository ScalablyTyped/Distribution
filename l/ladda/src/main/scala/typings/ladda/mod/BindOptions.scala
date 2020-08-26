package typings.ladda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindOptions extends js.Object {
  /**
    * A function to be called with the Ladda instance when a target button is clicked.
    */
  var callback: js.UndefOr[js.Function1[/* instance */ LaddaButton, Unit]] = js.native
  /**
    * Number of milliseconds to wait before automatically cancelling the animation.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object BindOptions {
  @scala.inline
  def apply(): BindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindOptions]
  }
  @scala.inline
  implicit class BindOptionsOps[Self <: BindOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: /* instance */ LaddaButton => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

