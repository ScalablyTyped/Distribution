package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesOrganizationNodesOptions extends js.Object {
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) An optional column index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Note that
    * this option name is counter intuitive in inverted charts, like for
    * example an organization chart rendered top down. In this case the
    * "columns" are horizontal.
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The job description for the node card, will be inserted by
    * the default `dataLabel.nodeFormatter`.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) An image for the node card, will be inserted by the default
    * `dataLabel.nodeFormatter`.
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Layout for the node's children. If `hanging`, this node's
    * children will hang below their parent, allowing a tighter packing of
    * nodes in the diagram.
    */
  var layout: js.UndefOr[SeriesOrganizationNodesLayoutValue] = js.undefined
  /**
    * (Highcharts) An optional level index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Alias of
    * `nodes.column`, but in inverted sankeys and org charts, the levels are
    * laid out as rows.
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) In a horizontal layout, the vertical offset of a node in
    * terms of weight. Positive values shift the node downwards, negative shift
    * it upwards. In a vertical layout, like organization chart, the offset is
    * horizontal.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size plus `nodePadding`.
    */
  var offset: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) The job title for the node card, will be inserted by the
    * default `dataLabel.nodeFormatter`.
    */
  var title: js.UndefOr[String] = js.undefined
}

object SeriesOrganizationNodesOptions {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    column: Int | Double = null,
    description: String = null,
    id: String = null,
    image: String = null,
    layout: SeriesOrganizationNodesLayoutValue = null,
    level: Int | Double = null,
    name: String = null,
    offset: Double | String = null,
    title: String = null
  ): SeriesOrganizationNodesOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SeriesOrganizationNodesOptions]
  }
}

