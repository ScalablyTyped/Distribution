package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterconnectDiagnosticsLinkOpticalPower extends StObject {
  
  /**
    * The status of the current value when compared to the warning and alarm levels for the receiving or transmitting transceiver. Possible states include:
    * - OK: The value has not crossed a warning threshold.
    * - LOW_WARNING: The value has crossed below the low warning threshold.
    * - HIGH_WARNING: The value has crossed above the high warning threshold.
    * - LOW_ALARM: The value has crossed below the low alarm threshold.
    * - HIGH_ALARM: The value has crossed above the high alarm threshold.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the current receiving or transmitting optical power, read in dBm. Take a known good optical value, give it a 10% margin and trigger warnings relative to that value. In
    * general, a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object InterconnectDiagnosticsLinkOpticalPower {
  
  @scala.inline
  def apply(): InterconnectDiagnosticsLinkOpticalPower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectDiagnosticsLinkOpticalPower]
  }
  
  @scala.inline
  implicit class InterconnectDiagnosticsLinkOpticalPowerMutableBuilder[Self <: InterconnectDiagnosticsLinkOpticalPower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
