package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedBubbleDataLabelsTextPathOptionsObject extends js.Object {
  /**
    * Presentation attributes for the text path.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.undefined
  /**
    * Enable or disable `textPath` option for link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesPackedBubbleDataLabelsTextPathOptionsObject {
  @scala.inline
  def apply(attributes: SVGAttributes = null, enabled: js.UndefOr[Boolean] = js.undefined): SeriesPackedBubbleDataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsTextPathOptionsObject]
  }
}

