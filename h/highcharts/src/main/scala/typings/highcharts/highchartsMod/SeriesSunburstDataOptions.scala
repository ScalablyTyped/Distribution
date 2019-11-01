package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSunburstDataOptions extends js.Object {
  var dataLabels: js.UndefOr[
    SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts) The name decides the text for a word.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Use this option to build a tree structure. The value should
    * be the id of the point which is the parent. If no points has a matching
    * id, or this option is undefined, then the parent will be set to the root.
    */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Whether to display a slice offset from the center. When a
    * sunburst point is sliced, its children are also offset.
    */
  var sliced: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The value of the point, resulting in a relative area of the
    * point in the sunburst.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highcharts) The weighting of a word. The weight decides the relative
    * size of a word compared to the rest of the collection.
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object SeriesSunburstDataOptions {
  @scala.inline
  def apply(
    dataLabels: SeriesSunburstDataLabelsOptionsObject | js.Array[SeriesSunburstDataLabelsOptionsObject] = null,
    name: String = null,
    parent: String = null,
    sliced: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null,
    weight: Int | Double = null
  ): SeriesSunburstDataOptions = {
    val __obj = js.Dynamic.literal()
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(sliced)) __obj.updateDynamic("sliced")(sliced)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSunburstDataOptions]
  }
}

