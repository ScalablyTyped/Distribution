package typings.halogen.halogenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiusLoaderProps extends MarginLoaderProps[String] {
  var height: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object RadiusLoaderProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    height: String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    radius: String = null,
    size: String = null,
    verticalAlign: VerticalAlign = null,
    width: String = null
  ): RadiusLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (radius != null) __obj.updateDynamic("radius")(radius)
    if (size != null) __obj.updateDynamic("size")(size)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[RadiusLoaderProps]
  }
}

