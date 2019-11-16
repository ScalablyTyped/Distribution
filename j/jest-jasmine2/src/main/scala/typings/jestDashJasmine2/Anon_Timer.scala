package typings.jestDashJasmine2

import typings.jestDashJasmine2.buildJasmineTimerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timer extends js.Object {
  var timer: js.UndefOr[default] = js.undefined
}

object Anon_Timer {
  @scala.inline
  def apply(timer: default = null): Anon_Timer = {
    val __obj = js.Dynamic.literal()
    if (timer != null) __obj.updateDynamic("timer")(timer)
    __obj.asInstanceOf[Anon_Timer]
  }
}

