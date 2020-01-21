package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInterconnectDiagnosticsLinkOpticalPower extends js.Object {
  /**
    * The status of the current value when compared to the warning and alarm
    * levels for the receiving or transmitting transceiver. Possible states
    * include:   - OK: The value has not crossed a warning threshold.  -
    * LOW_WARNING: The value has crossed below the low warning threshold.  -
    * HIGH_WARNING: The value has crossed above the high warning threshold.  -
    * LOW_ALARM: The value has crossed below the low alarm threshold.  -
    * HIGH_ALARM: The value has crossed above the high alarm threshold.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Value of the current receiving or transmitting optical power, read in
    * dBm. Take a known good optical value, give it a 10% margin and trigger
    * warnings relative to that value. In general, a -7dBm warning and a -11dBm
    * alarm are good optical value estimates for most links.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaInterconnectDiagnosticsLinkOpticalPower {
  @scala.inline
  def apply(state: String = null, value: Int | Double = null): SchemaInterconnectDiagnosticsLinkOpticalPower = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsLinkOpticalPower]
  }
}

