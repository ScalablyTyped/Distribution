package typings.mapnik

import typings.mapnik.mapnikStrings.jpeg
import typings.mapnik.mapnikStrings.png
import typings.mapnik.mapnikStrings.tiff
import typings.mapnik.mapnikStrings.webp
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AreathresholdCallback extends js.Object {
  var area_threshold: js.UndefOr[Double] = js.undefined
  var callback: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
  var fill_type: js.UndefOr[Double] = js.undefined
  var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.undefined
  var max_extent: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var multi_polygon_union: js.UndefOr[Boolean] = js.undefined
  var offset_x: js.UndefOr[Double] = js.undefined
  var offset_y: js.UndefOr[Double] = js.undefined
  var process_all_rings: js.UndefOr[Boolean] = js.undefined
  var reencode: js.UndefOr[Boolean] = js.undefined
  var scale_denominator: js.UndefOr[Double] = js.undefined
  var scale_factor: js.UndefOr[Double] = js.undefined
  var scaling_method: js.UndefOr[String] = js.undefined
  var simplify_distance: js.UndefOr[Double] = js.undefined
  var strictly_simple: js.UndefOr[Boolean] = js.undefined
  var threading_mode: js.UndefOr[String] = js.undefined
}

object Anon_AreathresholdCallback {
  @scala.inline
  def apply(
    area_threshold: Int | Double = null,
    callback: /* err */ Error => Unit = null,
    fill_type: Int | Double = null,
    image_format: webp | jpeg | png | tiff = null,
    max_extent: js.Tuple4[Double, Double, Double, Double] = null,
    multi_polygon_union: js.UndefOr[Boolean] = js.undefined,
    offset_x: Int | Double = null,
    offset_y: Int | Double = null,
    process_all_rings: js.UndefOr[Boolean] = js.undefined,
    reencode: js.UndefOr[Boolean] = js.undefined,
    scale_denominator: Int | Double = null,
    scale_factor: Int | Double = null,
    scaling_method: String = null,
    simplify_distance: Int | Double = null,
    strictly_simple: js.UndefOr[Boolean] = js.undefined,
    threading_mode: String = null
  ): Anon_AreathresholdCallback = {
    val __obj = js.Dynamic.literal()
    if (area_threshold != null) __obj.updateDynamic("area_threshold")(area_threshold.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (fill_type != null) __obj.updateDynamic("fill_type")(fill_type.asInstanceOf[js.Any])
    if (image_format != null) __obj.updateDynamic("image_format")(image_format.asInstanceOf[js.Any])
    if (max_extent != null) __obj.updateDynamic("max_extent")(max_extent.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_polygon_union)) __obj.updateDynamic("multi_polygon_union")(multi_polygon_union.asInstanceOf[js.Any])
    if (offset_x != null) __obj.updateDynamic("offset_x")(offset_x.asInstanceOf[js.Any])
    if (offset_y != null) __obj.updateDynamic("offset_y")(offset_y.asInstanceOf[js.Any])
    if (!js.isUndefined(process_all_rings)) __obj.updateDynamic("process_all_rings")(process_all_rings.asInstanceOf[js.Any])
    if (!js.isUndefined(reencode)) __obj.updateDynamic("reencode")(reencode.asInstanceOf[js.Any])
    if (scale_denominator != null) __obj.updateDynamic("scale_denominator")(scale_denominator.asInstanceOf[js.Any])
    if (scale_factor != null) __obj.updateDynamic("scale_factor")(scale_factor.asInstanceOf[js.Any])
    if (scaling_method != null) __obj.updateDynamic("scaling_method")(scaling_method.asInstanceOf[js.Any])
    if (simplify_distance != null) __obj.updateDynamic("simplify_distance")(simplify_distance.asInstanceOf[js.Any])
    if (!js.isUndefined(strictly_simple)) __obj.updateDynamic("strictly_simple")(strictly_simple.asInstanceOf[js.Any])
    if (threading_mode != null) __obj.updateDynamic("threading_mode")(threading_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AreathresholdCallback]
  }
}

