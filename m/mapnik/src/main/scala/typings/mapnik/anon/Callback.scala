package typings.mapnik.anon

import typings.mapnik.mapnikStrings.jpeg
import typings.mapnik.mapnikStrings.png
import typings.mapnik.mapnikStrings.tiff
import typings.mapnik.mapnikStrings.webp
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
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

object Callback {
  @scala.inline
  def apply(
    area_threshold: js.UndefOr[Double] = js.undefined,
    callback: /* err */ Error => Unit = null,
    fill_type: js.UndefOr[Double] = js.undefined,
    image_format: webp | jpeg | png | tiff = null,
    max_extent: js.Tuple4[Double, Double, Double, Double] = null,
    multi_polygon_union: js.UndefOr[Boolean] = js.undefined,
    offset_x: js.UndefOr[Double] = js.undefined,
    offset_y: js.UndefOr[Double] = js.undefined,
    process_all_rings: js.UndefOr[Boolean] = js.undefined,
    reencode: js.UndefOr[Boolean] = js.undefined,
    scale_denominator: js.UndefOr[Double] = js.undefined,
    scale_factor: js.UndefOr[Double] = js.undefined,
    scaling_method: String = null,
    simplify_distance: js.UndefOr[Double] = js.undefined,
    strictly_simple: js.UndefOr[Boolean] = js.undefined,
    threading_mode: String = null
  ): Callback = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(area_threshold)) __obj.updateDynamic("area_threshold")(area_threshold.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(fill_type)) __obj.updateDynamic("fill_type")(fill_type.get.asInstanceOf[js.Any])
    if (image_format != null) __obj.updateDynamic("image_format")(image_format.asInstanceOf[js.Any])
    if (max_extent != null) __obj.updateDynamic("max_extent")(max_extent.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_polygon_union)) __obj.updateDynamic("multi_polygon_union")(multi_polygon_union.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset_x)) __obj.updateDynamic("offset_x")(offset_x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset_y)) __obj.updateDynamic("offset_y")(offset_y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(process_all_rings)) __obj.updateDynamic("process_all_rings")(process_all_rings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reencode)) __obj.updateDynamic("reencode")(reencode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale_denominator)) __obj.updateDynamic("scale_denominator")(scale_denominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale_factor)) __obj.updateDynamic("scale_factor")(scale_factor.get.asInstanceOf[js.Any])
    if (scaling_method != null) __obj.updateDynamic("scaling_method")(scaling_method.asInstanceOf[js.Any])
    if (!js.isUndefined(simplify_distance)) __obj.updateDynamic("simplify_distance")(simplify_distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictly_simple)) __obj.updateDynamic("strictly_simple")(strictly_simple.get.asInstanceOf[js.Any])
    if (threading_mode != null) __obj.updateDynamic("threading_mode")(threading_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

