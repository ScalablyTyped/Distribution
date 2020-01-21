package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a LineStyle within a StyleSetting
  */
@js.native
trait SchemaLineStyle extends js.Object {
  /**
    * Color of the line in #RRGGBB format.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Column-value, gradient or buckets styler that is used to determine the
    * line color and opacity.
    */
  var strokeColorStyler: js.UndefOr[SchemaStyleFunction] = js.native
  /**
    * Opacity of the line : 0.0 (transparent) to 1.0 (opaque).
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /**
    * Width of the line in pixels.
    */
  var strokeWeight: js.UndefOr[Double] = js.native
  /**
    * Column-value or bucket styler that is used to determine the width of the
    * line.
    */
  var strokeWeightStyler: js.UndefOr[SchemaStyleFunction] = js.native
}

object SchemaLineStyle {
  @scala.inline
  def apply(
    strokeColor: String = null,
    strokeColorStyler: SchemaStyleFunction = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    strokeWeightStyler: SchemaStyleFunction = null
  ): SchemaLineStyle = {
    val __obj = js.Dynamic.literal()
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLineStyle]
  }
}

