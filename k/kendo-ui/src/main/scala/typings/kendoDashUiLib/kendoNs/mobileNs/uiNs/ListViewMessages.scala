package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewMessages extends js.Object {
  var loadMoreText: js.UndefOr[java.lang.String] = js.undefined
  var pullTemplate: js.UndefOr[java.lang.String] = js.undefined
  var refreshTemplate: js.UndefOr[java.lang.String] = js.undefined
  var releaseTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object ListViewMessages {
  @scala.inline
  def apply(
    loadMoreText: java.lang.String = null,
    pullTemplate: java.lang.String = null,
    refreshTemplate: java.lang.String = null,
    releaseTemplate: java.lang.String = null
  ): ListViewMessages = {
    val __obj = js.Dynamic.literal()
    if (loadMoreText != null) __obj.updateDynamic("loadMoreText")(loadMoreText)
    if (pullTemplate != null) __obj.updateDynamic("pullTemplate")(pullTemplate)
    if (refreshTemplate != null) __obj.updateDynamic("refreshTemplate")(refreshTemplate)
    if (releaseTemplate != null) __obj.updateDynamic("releaseTemplate")(releaseTemplate)
    __obj.asInstanceOf[ListViewMessages]
  }
}

