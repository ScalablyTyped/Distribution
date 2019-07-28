package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedBubbleDataLabelsTextPath extends js.Object {
  /**
    * Presentation attributes for the text path.
    */
  var attributes: SVGAttributes
  /**
    * Enable or disable `textPath` option for link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesPackedBubbleDataLabelsTextPath {
  @scala.inline
  def apply(attributes: SVGAttributes, enabled: js.UndefOr[Boolean] = js.undefined): SeriesPackedBubbleDataLabelsTextPath = {
    val __obj = js.Dynamic.literal(attributes = attributes)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsTextPath]
  }
}

