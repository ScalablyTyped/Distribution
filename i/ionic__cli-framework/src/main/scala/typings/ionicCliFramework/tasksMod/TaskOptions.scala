package typings.ionicCliFramework.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  val msg: js.UndefOr[String] = js.undefined
  val tickInterval: js.UndefOr[Double] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(msg: String = null, tickInterval: js.UndefOr[Double] = js.undefined): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (!js.isUndefined(tickInterval)) __obj.updateDynamic("tickInterval")(tickInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOptions]
  }
}

