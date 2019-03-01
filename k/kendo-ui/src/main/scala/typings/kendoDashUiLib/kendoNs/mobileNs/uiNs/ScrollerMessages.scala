package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerMessages extends js.Object {
  var pullTemplate: js.UndefOr[java.lang.String] = js.undefined
  var refreshTemplate: js.UndefOr[java.lang.String] = js.undefined
  var releaseTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object ScrollerMessages {
  @scala.inline
  def apply(
    pullTemplate: java.lang.String = null,
    refreshTemplate: java.lang.String = null,
    releaseTemplate: java.lang.String = null
  ): ScrollerMessages = {
    val __obj = js.Dynamic.literal()
    if (pullTemplate != null) __obj.updateDynamic("pullTemplate")(pullTemplate)
    if (refreshTemplate != null) __obj.updateDynamic("refreshTemplate")(refreshTemplate)
    if (releaseTemplate != null) __obj.updateDynamic("releaseTemplate")(releaseTemplate)
    __obj.asInstanceOf[ScrollerMessages]
  }
}

