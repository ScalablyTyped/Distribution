package typings.jqueryTools.JQueryTools.overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskOptions extends js.Object {
  /** CSS color string (i.e. hex value) */
  var color: js.UndefOr[String] = js.undefined
  /** load speed in milliseconds */
  var loadSpeed: js.UndefOr[Double] = js.undefined
  /** Opacity of mask.  Between 0 and 1. */
  var opacity: js.UndefOr[Double] = js.undefined
}

object MaskOptions {
  @scala.inline
  def apply(
    color: String = null,
    loadSpeed: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): MaskOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSpeed)) __obj.updateDynamic("loadSpeed")(loadSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskOptions]
  }
}

