package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerMessages extends js.Object {
  var pullTemplate: js.UndefOr[String] = js.undefined
  var refreshTemplate: js.UndefOr[String] = js.undefined
  var releaseTemplate: js.UndefOr[String] = js.undefined
}

object ScrollerMessages {
  @scala.inline
  def apply(pullTemplate: String = null, refreshTemplate: String = null, releaseTemplate: String = null): ScrollerMessages = {
    val __obj = js.Dynamic.literal()
    if (pullTemplate != null) __obj.updateDynamic("pullTemplate")(pullTemplate.asInstanceOf[js.Any])
    if (refreshTemplate != null) __obj.updateDynamic("refreshTemplate")(refreshTemplate.asInstanceOf[js.Any])
    if (releaseTemplate != null) __obj.updateDynamic("releaseTemplate")(releaseTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollerMessages]
  }
}

