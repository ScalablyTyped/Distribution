package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundBorderContainer extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[AnonRadiusString] = js.undefined
  var container: js.UndefOr[AnonZIndex] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var overlay: js.UndefOr[AnonBackgroundBackgroundType] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[String] = js.undefined
}

object AnonBackgroundBorderContainer {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: AnonRadiusString = null,
    container: AnonZIndex = null,
    extend: ExtendType = null,
    overlay: AnonBackgroundBackgroundType = null,
    responsiveBreakpoint: String = null,
    zIndex: String = null
  ): AnonBackgroundBorderContainer = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundBorderContainer]
  }
}

