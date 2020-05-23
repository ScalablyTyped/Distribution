package typings.materialUi.focusRippleMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusRippleProps extends Props[FocusRipple] {
  var color: js.UndefOr[String] = js.undefined
  var innerStyle: js.UndefOr[CSSProperties] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FocusRippleProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    color: String = null,
    innerStyle: CSSProperties = null,
    key: Key = null,
    opacity: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[FocusRipple]] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): FocusRippleProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusRippleProps]
  }
}

