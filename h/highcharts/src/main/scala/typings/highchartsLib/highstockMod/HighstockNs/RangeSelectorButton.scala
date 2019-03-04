package typings
package highchartsLib.highstockMod.HighstockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButton extends js.Object {
   // Defines the timespan, can be one of 'millisecond', 'second', 'minute', 'day', 'week', 'month', 'ytd' (year to date), 'year' and 'all'.
  var count: js.UndefOr[scala.Double] = js.undefined
  var dataGrouping: js.UndefOr[js.Any] = js.undefined
   // not sure how this works
  var events: js.UndefOr[RangeSelectorButtonEvent] = js.undefined
  var text: java.lang.String
  var `type`: java.lang.String
}

object RangeSelectorButton {
  @scala.inline
  def apply(
    text: java.lang.String,
    `type`: java.lang.String,
    count: scala.Int | scala.Double = null,
    dataGrouping: js.Any = null,
    events: RangeSelectorButtonEvent = null
  ): RangeSelectorButton = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[RangeSelectorButton]
  }
}

