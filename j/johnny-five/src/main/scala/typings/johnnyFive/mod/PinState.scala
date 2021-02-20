package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinState extends StObject {
  
  var analogChannel: Double = js.native
  
  var mode: Double = js.native
  
  var report: Double = js.native
  
  var supportedModes: js.Array[Double] = js.native
  
  var value: Double = js.native
}
object PinState {
  
  @scala.inline
  def apply(
    analogChannel: Double,
    mode: Double,
    report: Double,
    supportedModes: js.Array[Double],
    value: Double
  ): PinState = {
    val __obj = js.Dynamic.literal(analogChannel = analogChannel.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinState]
  }
  
  @scala.inline
  implicit class PinStateMutableBuilder[Self <: PinState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalogChannel(value: Double): Self = StObject.set(x, "analogChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: Double): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedModes(value: js.Array[Double]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedModesVarargs(value: Double*): Self = StObject.set(x, "supportedModes", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
