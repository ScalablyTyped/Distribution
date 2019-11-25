package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesEditable extends js.Object {
  var confirmation: js.UndefOr[String] = js.undefined
}

object SchedulerMessagesEditable {
  @scala.inline
  def apply(confirmation: String = null): SchedulerMessagesEditable = {
    val __obj = js.Dynamic.literal()
    if (confirmation != null) __obj.updateDynamic("confirmation")(confirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerMessagesEditable]
  }
}

