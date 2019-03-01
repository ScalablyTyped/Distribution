package typings
package halogenLib.halogenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HalogenCommonProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlign] = js.undefined
}

object HalogenCommonProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    color: java.lang.String = null,
    id: java.lang.String = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: VerticalAlign = null
  ): HalogenCommonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[HalogenCommonProps]
  }
}

