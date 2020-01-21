package typings.jestJasmine2

import typings.jestJasmine2.timerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimer extends js.Object {
  var timer: js.UndefOr[default] = js.undefined
}

object AnonTimer {
  @scala.inline
  def apply(timer: default = null): AnonTimer = {
    val __obj = js.Dynamic.literal()
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimer]
  }
}

