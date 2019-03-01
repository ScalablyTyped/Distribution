package typings
package jqueryDashDrawerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryDrawerOptions extends js.Object {
  var `class`: js.UndefOr[JQueryDrawerClassOptions] = js.undefined
  var iscroll: js.UndefOr[iscrollLib.IScrollOptions] = js.undefined
  var showOverlay: js.UndefOr[scala.Boolean] = js.undefined
}

object JQueryDrawerOptions {
  @scala.inline
  def apply(
    `class`: JQueryDrawerClassOptions = null,
    iscroll: iscrollLib.IScrollOptions = null,
    showOverlay: js.UndefOr[scala.Boolean] = js.undefined
  ): JQueryDrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (iscroll != null) __obj.updateDynamic("iscroll")(iscroll)
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay)
    __obj.asInstanceOf[JQueryDrawerOptions]
  }
}

