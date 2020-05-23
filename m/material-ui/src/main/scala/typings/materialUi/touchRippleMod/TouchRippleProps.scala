package typings.materialUi.touchRippleMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchRippleProps extends Props[TouchRipple] {
  var abortOnScroll: js.UndefOr[Boolean] = js.undefined
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TouchRippleProps {
  @scala.inline
  def apply(
    abortOnScroll: js.UndefOr[Boolean] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    color: String = null,
    key: Key = null,
    opacity: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[TouchRipple]] = js.undefined,
    style: CSSProperties = null
  ): TouchRippleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnScroll)) __obj.updateDynamic("abortOnScroll")(abortOnScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchRippleProps]
  }
}

