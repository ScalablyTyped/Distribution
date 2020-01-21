package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGroupableMessages extends js.Object {
  var empty: js.UndefOr[String] = js.undefined
}

object GridGroupableMessages {
  @scala.inline
  def apply(empty: String = null): GridGroupableMessages = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridGroupableMessages]
  }
}

