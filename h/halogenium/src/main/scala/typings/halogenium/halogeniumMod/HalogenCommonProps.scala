package typings.halogenium.halogeniumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HalogenCommonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var verticalAlign: js.UndefOr[VerticalAlign] = js.undefined
}

object HalogenCommonProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
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

