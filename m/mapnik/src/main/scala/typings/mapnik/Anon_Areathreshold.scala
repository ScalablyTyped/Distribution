package typings.mapnik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Areathreshold extends js.Object {
  var area_threshold: js.UndefOr[Double] = js.undefined
  var fill_type: js.UndefOr[Double] = js.undefined
  var multi_polygon_union: js.UndefOr[Boolean] = js.undefined
  var process_all_rings: js.UndefOr[Boolean] = js.undefined
  var simplify_distance: js.UndefOr[Double] = js.undefined
  var strictly_simple: js.UndefOr[Boolean] = js.undefined
}

object Anon_Areathreshold {
  @scala.inline
  def apply(
    area_threshold: Int | Double = null,
    fill_type: Int | Double = null,
    multi_polygon_union: js.UndefOr[Boolean] = js.undefined,
    process_all_rings: js.UndefOr[Boolean] = js.undefined,
    simplify_distance: Int | Double = null,
    strictly_simple: js.UndefOr[Boolean] = js.undefined
  ): Anon_Areathreshold = {
    val __obj = js.Dynamic.literal()
    if (area_threshold != null) __obj.updateDynamic("area_threshold")(area_threshold.asInstanceOf[js.Any])
    if (fill_type != null) __obj.updateDynamic("fill_type")(fill_type.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_polygon_union)) __obj.updateDynamic("multi_polygon_union")(multi_polygon_union)
    if (!js.isUndefined(process_all_rings)) __obj.updateDynamic("process_all_rings")(process_all_rings)
    if (simplify_distance != null) __obj.updateDynamic("simplify_distance")(simplify_distance.asInstanceOf[js.Any])
    if (!js.isUndefined(strictly_simple)) __obj.updateDynamic("strictly_simple")(strictly_simple)
    __obj.asInstanceOf[Anon_Areathreshold]
  }
}

