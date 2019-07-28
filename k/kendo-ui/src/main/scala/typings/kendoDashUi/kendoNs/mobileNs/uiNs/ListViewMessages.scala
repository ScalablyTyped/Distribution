package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewMessages extends js.Object {
  var loadMoreText: js.UndefOr[String] = js.undefined
  var pullTemplate: js.UndefOr[String] = js.undefined
  var refreshTemplate: js.UndefOr[String] = js.undefined
  var releaseTemplate: js.UndefOr[String] = js.undefined
}

object ListViewMessages {
  @scala.inline
  def apply(
    loadMoreText: String = null,
    pullTemplate: String = null,
    refreshTemplate: String = null,
    releaseTemplate: String = null
  ): ListViewMessages = {
    val __obj = js.Dynamic.literal()
    if (loadMoreText != null) __obj.updateDynamic("loadMoreText")(loadMoreText)
    if (pullTemplate != null) __obj.updateDynamic("pullTemplate")(pullTemplate)
    if (refreshTemplate != null) __obj.updateDynamic("refreshTemplate")(refreshTemplate)
    if (releaseTemplate != null) __obj.updateDynamic("releaseTemplate")(releaseTemplate)
    __obj.asInstanceOf[ListViewMessages]
  }
}

