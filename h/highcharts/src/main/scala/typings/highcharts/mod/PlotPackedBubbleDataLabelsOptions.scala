package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedBubbleDataLabelsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Presentation attributes for the
    * text path.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The format string specifying
    * what to show for _node_ in the networkgraph. In v7.0 defaults to `{key}`,
    * since v7.1 defaults to `undefined` and `formatter` is used instead.
    */
  var format: js.UndefOr[String] = js.undefined
  var parentNodeFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for a _node_ label text
    * which should follow marker's shape.
    *
    * **Note:** Only SVG-based renderer supports this option.
    */
  var textPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.undefined
}

object PlotPackedBubbleDataLabelsOptions {
  @scala.inline
  def apply(
    attributes: SVGAttributes = null,
    format: String = null,
    parentNodeFormat: String = null,
    textPath: DataLabelsTextPathOptionsObject = null
  ): PlotPackedBubbleDataLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (parentNodeFormat != null) __obj.updateDynamic("parentNodeFormat")(parentNodeFormat.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedBubbleDataLabelsOptions]
  }
}

