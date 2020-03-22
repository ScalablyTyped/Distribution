package typings.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/tasks.TaskOptions> */
trait PartialTaskOptions extends js.Object {
  var msg: js.UndefOr[String] = js.undefined
  var tickInterval: js.UndefOr[Double] = js.undefined
}

object PartialTaskOptions {
  @scala.inline
  def apply(msg: String = null, tickInterval: Int | Double = null): PartialTaskOptions = {
    val __obj = js.Dynamic.literal()
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTaskOptions]
  }
}

