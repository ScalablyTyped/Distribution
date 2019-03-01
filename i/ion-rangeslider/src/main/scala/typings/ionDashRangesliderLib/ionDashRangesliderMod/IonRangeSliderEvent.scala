package typings
package ionDashRangesliderLib.ionDashRangesliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRangeSliderEvent extends js.Object {
   // MAX values
  var from: scala.Double
   // FROM value
  var from_percent: scala.Double
   // MAX prettified (if used)
  var from_pretty: java.lang.String
   // FROM value in percents
  var from_value: scala.Double
  var input: ionDashRangesliderLib.ionDashRangesliderMod.Global.JQuery
   // MIN value
  var max: scala.Double
   // MIN prettified (if used)
  var max_pretty: java.lang.String
   // jQuery-link to sliders container
  var min: scala.Double
   // TO index in values array (if used)
  var min_pretty: java.lang.String
   // jQuery-link to input
  var slider: ionDashRangesliderLib.ionDashRangesliderMod.Global.JQuery
   // FROM index in values array (if used)
  var to: scala.Double
   // TO value
  var to_percent: scala.Double
   // FROM prettified (if used)
  var to_pretty: java.lang.String
   // TO value in percents
  var to_value: scala.Double
}

object IonRangeSliderEvent {
  @scala.inline
  def apply(
    from: scala.Double,
    from_percent: scala.Double,
    from_pretty: java.lang.String,
    from_value: scala.Double,
    input: ionDashRangesliderLib.ionDashRangesliderMod.Global.JQuery,
    max: scala.Double,
    max_pretty: java.lang.String,
    min: scala.Double,
    min_pretty: java.lang.String,
    slider: ionDashRangesliderLib.ionDashRangesliderMod.Global.JQuery,
    to: scala.Double,
    to_percent: scala.Double,
    to_pretty: java.lang.String,
    to_value: scala.Double
  ): IonRangeSliderEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("from_percent")(from_percent)
    __obj.updateDynamic("from_pretty")(from_pretty)
    __obj.updateDynamic("from_value")(from_value)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("max_pretty")(max_pretty)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("min_pretty")(min_pretty)
    __obj.updateDynamic("slider")(slider)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("to_percent")(to_percent)
    __obj.updateDynamic("to_pretty")(to_pretty)
    __obj.updateDynamic("to_value")(to_value)
    __obj.asInstanceOf[IonRangeSliderEvent]
  }
}

