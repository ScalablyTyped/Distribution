package typings.mapnik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Areathreshold extends js.Object {
  var area_threshold: js.UndefOr[Double] = js.undefined
  var fill_type: js.UndefOr[Double] = js.undefined
  var multi_polygon_union: js.UndefOr[Boolean] = js.undefined
  var process_all_rings: js.UndefOr[Boolean] = js.undefined
  var simplify_distance: js.UndefOr[Double] = js.undefined
  var strictly_simple: js.UndefOr[Boolean] = js.undefined
}

object Areathreshold {
  @scala.inline
  def apply(
    area_threshold: js.UndefOr[Double] = js.undefined,
    fill_type: js.UndefOr[Double] = js.undefined,
    multi_polygon_union: js.UndefOr[Boolean] = js.undefined,
    process_all_rings: js.UndefOr[Boolean] = js.undefined,
    simplify_distance: js.UndefOr[Double] = js.undefined,
    strictly_simple: js.UndefOr[Boolean] = js.undefined
  ): Areathreshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(area_threshold)) __obj.updateDynamic("area_threshold")(area_threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fill_type)) __obj.updateDynamic("fill_type")(fill_type.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_polygon_union)) __obj.updateDynamic("multi_polygon_union")(multi_polygon_union.get.asInstanceOf[js.Any])
    if (!js.isUndefined(process_all_rings)) __obj.updateDynamic("process_all_rings")(process_all_rings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simplify_distance)) __obj.updateDynamic("simplify_distance")(simplify_distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictly_simple)) __obj.updateDynamic("strictly_simple")(strictly_simple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Areathreshold]
  }
}

