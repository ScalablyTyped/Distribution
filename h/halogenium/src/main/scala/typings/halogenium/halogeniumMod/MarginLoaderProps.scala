package typings.halogenium.halogeniumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginLoaderProps extends HalogenCommonProps {
  var margin: js.UndefOr[Double | String] = js.undefined
  var size: js.UndefOr[Double | String] = js.undefined
}

object MarginLoaderProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: Double | String = null,
    size: Double | String = null,
    verticalAlign: VerticalAlign = null
  ): MarginLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[MarginLoaderProps]
  }
}

