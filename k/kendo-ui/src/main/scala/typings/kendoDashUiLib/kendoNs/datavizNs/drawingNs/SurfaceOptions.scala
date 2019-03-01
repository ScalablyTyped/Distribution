package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ SurfaceClickEvent, scala.Unit]] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var mouseenter: js.UndefOr[js.Function1[/* e */ SurfaceMouseenterEvent, scala.Unit]] = js.undefined
  var mouseleave: js.UndefOr[js.Function1[/* e */ SurfaceMouseleaveEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[SurfaceTooltip] = js.undefined
  var tooltipClose: js.UndefOr[js.Function1[/* e */ SurfaceTooltipCloseEvent, scala.Unit]] = js.undefined
  var tooltipOpen: js.UndefOr[js.Function1[/* e */ SurfaceTooltipOpenEvent, scala.Unit]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object SurfaceOptions {
  @scala.inline
  def apply(
    click: js.Function1[/* e */ SurfaceClickEvent, scala.Unit] = null,
    height: java.lang.String = null,
    mouseenter: js.Function1[/* e */ SurfaceMouseenterEvent, scala.Unit] = null,
    mouseleave: js.Function1[/* e */ SurfaceMouseleaveEvent, scala.Unit] = null,
    name: java.lang.String = null,
    tooltip: SurfaceTooltip = null,
    tooltipClose: js.Function1[/* e */ SurfaceTooltipCloseEvent, scala.Unit] = null,
    tooltipOpen: js.Function1[/* e */ SurfaceTooltipOpenEvent, scala.Unit] = null,
    `type`: java.lang.String = null,
    width: java.lang.String = null
  ): SurfaceOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (height != null) __obj.updateDynamic("height")(height)
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(mouseenter)
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(mouseleave)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipClose != null) __obj.updateDynamic("tooltipClose")(tooltipClose)
    if (tooltipOpen != null) __obj.updateDynamic("tooltipOpen")(tooltipOpen)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SurfaceOptions]
  }
}

