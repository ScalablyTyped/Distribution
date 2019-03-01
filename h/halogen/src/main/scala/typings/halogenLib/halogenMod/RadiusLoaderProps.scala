package typings
package halogenLib.halogenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiusLoaderProps
  extends MarginLoaderProps[java.lang.String] {
  var height: js.UndefOr[java.lang.String] = js.undefined
  var radius: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object RadiusLoaderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String = null,
    height: java.lang.String = null,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    margin: java.lang.String = null,
    radius: java.lang.String = null,
    size: java.lang.String = null,
    verticalAlign: VerticalAlign = null,
    width: java.lang.String = null
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

