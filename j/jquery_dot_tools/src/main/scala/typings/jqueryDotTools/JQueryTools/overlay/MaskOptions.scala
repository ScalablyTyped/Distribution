package typings.jqueryDotTools.JQueryTools.overlay

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
  def apply(color: String = null, loadSpeed: Int | Double = null, opacity: Int | Double = null): MaskOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (loadSpeed != null) __obj.updateDynamic("loadSpeed")(loadSpeed.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskOptions]
  }
}

