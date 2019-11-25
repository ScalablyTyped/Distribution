package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.checkboxClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesCheckboxClickEventObject extends js.Object {
  /**
    * Whether the box has been checked.
    */
  var checked: Boolean
  /**
    * Related series.
    */
  var item: Series
  /**
    * Related series.
    */
  var target: Series
  /**
    * Event type.
    */
  var `type`: checkboxClick
}

object SeriesCheckboxClickEventObject {
  @scala.inline
  def apply(checked: Boolean, item: Series, target: Series, `type`: checkboxClick): SeriesCheckboxClickEventObject = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCheckboxClickEventObject]
  }
}

