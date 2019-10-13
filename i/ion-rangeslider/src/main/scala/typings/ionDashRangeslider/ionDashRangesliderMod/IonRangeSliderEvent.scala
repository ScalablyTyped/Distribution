package typings.ionDashRangeslider.ionDashRangesliderMod

import typings.ionDashRangeslider.ionDashRangesliderMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRangeSliderEvent extends js.Object {
   // MAX values
  var from: Double
   // FROM value
  var from_percent: Double
   // MAX prettified (if used)
  var from_pretty: String
   // FROM value in percents
  var from_value: Double
  var input: JQuery
   // MIN value
  var max: Double
   // MIN prettified (if used)
  var max_pretty: String
   // jQuery-link to sliders container
  var min: Double
   // TO index in values array (if used)
  var min_pretty: String
   // jQuery-link to input
  var slider: JQuery
   // FROM index in values array (if used)
  var to: Double
   // TO value
  var to_percent: Double
   // FROM prettified (if used)
  var to_pretty: String
   // TO value in percents
  var to_value: Double
}

object IonRangeSliderEvent {
  @scala.inline
  def apply(
    from: Double,
    from_percent: Double,
    from_pretty: String,
    from_value: Double,
    input: JQuery,
    max: Double,
    max_pretty: String,
    min: Double,
    min_pretty: String,
    slider: JQuery,
    to: Double,
    to_percent: Double,
    to_pretty: String,
    to_value: Double
  ): IonRangeSliderEvent = {
    val __obj = js.Dynamic.literal(from = from, from_percent = from_percent, from_pretty = from_pretty, from_value = from_value, input = input, max = max, max_pretty = max_pretty, min = min, min_pretty = min_pretty, slider = slider, to = to, to_percent = to_percent, to_pretty = to_pretty, to_value = to_value)
  
    __obj.asInstanceOf[IonRangeSliderEvent]
  }
}

