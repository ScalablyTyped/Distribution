package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorderContainer extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[Anon_RadiusString] = js.undefined
  var container: js.UndefOr[Anon_ZIndex] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var overlay: js.UndefOr[Anon_BackgroundBackgroundType] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[String] = js.undefined
}

object Anon_BackgroundBorderContainer {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: Anon_RadiusString = null,
    container: Anon_ZIndex = null,
    extend: ExtendType = null,
    overlay: Anon_BackgroundBackgroundType = null,
    responsiveBreakpoint: String = null,
    zIndex: String = null
  ): Anon_BackgroundBorderContainer = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (container != null) __obj.updateDynamic("container")(container)
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex)
    __obj.asInstanceOf[Anon_BackgroundBorderContainer]
  }
}

