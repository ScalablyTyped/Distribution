package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a PolygonStyle within a StyleSetting
  */
@js.native
trait SchemaPolygonStyle extends js.Object {
  /**
    * Color of the interior of the polygon in #RRGGBB format.
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    * Column-value, gradient, or bucket styler that is used to determine the
    * interior color and opacity of the polygon.
    */
  var fillColorStyler: js.UndefOr[SchemaStyleFunction] = js.native
  /**
    * Opacity of the interior of the polygon: 0.0 (transparent) to 1.0
    * (opaque).
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * Color of the polygon border in #RRGGBB format.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Column-value, gradient or buckets styler that is used to determine the
    * border color and opacity.
    */
  var strokeColorStyler: js.UndefOr[SchemaStyleFunction] = js.native
  /**
    * Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque).
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /**
    * Width of the polyon border in pixels.
    */
  var strokeWeight: js.UndefOr[Double] = js.native
  /**
    * Column-value or bucket styler that is used to determine the width of the
    * polygon border.
    */
  var strokeWeightStyler: js.UndefOr[SchemaStyleFunction] = js.native
}

object SchemaPolygonStyle {
  @scala.inline
  def apply(
    fillColor: String = null,
    fillColorStyler: SchemaStyleFunction = null,
    fillOpacity: Int | Double = null,
    strokeColor: String = null,
    strokeColorStyler: SchemaStyleFunction = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    strokeWeightStyler: SchemaStyleFunction = null
  ): SchemaPolygonStyle = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillColorStyler != null) __obj.updateDynamic("fillColorStyler")(fillColorStyler.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeColorStyler != null) __obj.updateDynamic("strokeColorStyler")(strokeColorStyler.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (strokeWeightStyler != null) __obj.updateDynamic("strokeWeightStyler")(strokeWeightStyler.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPolygonStyle]
  }
}

