package typings
package halogenLib.halogenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginLoaderProps[T] extends HalogenCommonProps {
  var margin: js.UndefOr[T] = js.undefined
  var size: js.UndefOr[T] = js.undefined
}

object MarginLoaderProps {
  @scala.inline
  def apply[T](
    className: java.lang.String = null,
    color: java.lang.String = null,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    margin: T = null,
    size: T = null,
    verticalAlign: VerticalAlign = null
  ): MarginLoaderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[MarginLoaderProps[T]]
  }
}

