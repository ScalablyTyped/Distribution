package typings
package atIonicCliDashFrameworkLib.libTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  val msg: js.UndefOr[java.lang.String] = js.undefined
  val tickInterval: js.UndefOr[scala.Double] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(msg: java.lang.String = null, tickInterval: scala.Int | scala.Double = null): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOptions]
  }
}

