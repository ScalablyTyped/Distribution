package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the minimum and maximum values, the color, opacity, icon and
  * weight of a bucket within a StyleSetting.
  */
@js.native
trait SchemaBucket extends js.Object {
  /**
    * Color of line or the interior of a polygon in #RRGGBB format.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Icon name used for a point.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Maximum value in the selected column for a row to be styled according to
    * the bucket color, opacity, icon, or weight.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Minimum value in the selected column for a row to be styled according to
    * the bucket color, opacity, icon, or weight.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Opacity of the color: 0.0 (transparent) to 1.0 (opaque).
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Width of a line (in pixels).
    */
  var weight: js.UndefOr[Double] = js.native
}

object SchemaBucket {
  @scala.inline
  def apply(
    color: String = null,
    icon: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    opacity: Int | Double = null,
    weight: Int | Double = null
  ): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucket]
  }
}

