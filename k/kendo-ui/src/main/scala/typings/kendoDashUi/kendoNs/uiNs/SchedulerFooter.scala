package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerFooter extends js.Object {
  var command: js.UndefOr[String | Boolean] = js.undefined
}

object SchedulerFooter {
  @scala.inline
  def apply(command: String | Boolean = null): SchedulerFooter = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerFooter]
  }
}

