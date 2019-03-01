package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerMessagesEditable extends js.Object {
  var confirmation: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerMessagesEditable {
  @scala.inline
  def apply(confirmation: java.lang.String = null): SchedulerMessagesEditable = {
    val __obj = js.Dynamic.literal()
    if (confirmation != null) __obj.updateDynamic("confirmation")(confirmation)
    __obj.asInstanceOf[SchedulerMessagesEditable]
  }
}

