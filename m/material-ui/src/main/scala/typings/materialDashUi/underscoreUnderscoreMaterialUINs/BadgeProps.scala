package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var badgeContent: ReactNode
  var badgeStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    badgeContent: ReactNode = null,
    badgeStyle: CSSProperties = null,
    className: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (badgeContent != null) __obj.updateDynamic("badgeContent")(badgeContent.asInstanceOf[js.Any])
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BadgeProps]
  }
}

