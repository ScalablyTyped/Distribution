package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesNetworkgraphNodesOptions extends js.Object {
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Individual data label for each node. The options are the
    * same as the ones for series.networkgraph.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesNetworkgraphDataLabelsOptionsObject | js.Array[SeriesNetworkgraphDataLabelsOptionsObject]
  ] = js.undefined
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Mass of the node. By default, each node has mass equal to
    * it's marker radius . Mass is used to determine how two connected nodes
    * should affect each other:
    *
    * Attractive force is multiplied by the ratio of two connected nodes; if a
    * big node has weights twice as the small one, then the small one will move
    * towards the big one twice faster than the big one to the small one .
    */
  var mass: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.undefined
}

object SeriesNetworkgraphNodesOptions {
  @scala.inline
  def apply(
    color: ColorString = null,
    colorIndex: js.UndefOr[Double] = js.undefined,
    dataLabels: SeriesNetworkgraphDataLabelsOptionsObject | js.Array[SeriesNetworkgraphDataLabelsOptionsObject] = null,
    id: String = null,
    mass: js.UndefOr[Double] = js.undefined,
    name: String = null
  ): SeriesNetworkgraphNodesOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorIndex)) __obj.updateDynamic("colorIndex")(colorIndex.get.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesNetworkgraphNodesOptions]
  }
}

