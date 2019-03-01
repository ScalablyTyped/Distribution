package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var badgeContent: reactLib.reactMod.ReactNs.ReactNode
  var badgeStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    badgeContent: reactLib.reactMod.ReactNs.ReactNode,
    badgeStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    className: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badgeContent")(badgeContent.asInstanceOf[js.Any])
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BadgeProps]
  }
}

