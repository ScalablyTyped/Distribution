package typings.halogen.halogenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeLoaderProps extends HalogenCommonProps {
  var size: js.UndefOr[String] = js.undefined
}

object SizeLoaderProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    verticalAlign: VerticalAlign = null
  ): SizeLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (size != null) __obj.updateDynamic("size")(size)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[SizeLoaderProps]
  }
}

