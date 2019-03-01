package typings
package jqueryDotToolsLib.JQueryToolsNs.overlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskOptions extends js.Object {
  /** CSS color string (i.e. hex value) */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** load speed in milliseconds */
  var loadSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Opacity of mask.  Between 0 and 1. */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object MaskOptions {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    loadSpeed: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null
  ): MaskOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (loadSpeed != null) __obj.updateDynamic("loadSpeed")(loadSpeed.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskOptions]
  }
}

