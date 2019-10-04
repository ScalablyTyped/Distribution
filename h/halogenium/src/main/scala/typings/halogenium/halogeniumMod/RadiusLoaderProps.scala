package typings.halogenium.halogeniumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiusLoaderProps extends MarginLoaderProps {
  var height: js.UndefOr[Double | String] = js.undefined
  var radius: js.UndefOr[Double | String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object RadiusLoaderProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    height: Double | String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: Double | String = null,
    radius: Double | String = null,
    size: Double | String = null,
    verticalAlign: VerticalAlign = null,
    width: Double | String = null
  ): RadiusLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusLoaderProps]
  }
}

