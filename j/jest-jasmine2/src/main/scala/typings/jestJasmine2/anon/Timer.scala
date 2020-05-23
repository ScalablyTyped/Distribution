package typings.jestJasmine2.anon

import typings.jestJasmine2.timerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  var timer: js.UndefOr[default] = js.undefined
}

object Timer {
  @scala.inline
  def apply(timer: default = null): Timer = {
    val __obj = js.Dynamic.literal()
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
}

