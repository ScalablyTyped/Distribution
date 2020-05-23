package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelsTextPathOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Presentation attributes for the text path.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Enable or disable `textPath` option for
    * link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object DataLabelsTextPathOptionsObject {
  @scala.inline
  def apply(attributes: SVGAttributes = null, enabled: js.UndefOr[Boolean] = js.undefined): DataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelsTextPathOptionsObject]
  }
}

