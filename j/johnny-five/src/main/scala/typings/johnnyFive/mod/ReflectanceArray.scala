package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.calibratedData
import typings.johnnyFive.johnnyFiveStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "ReflectanceArray")
@js.native
open class ReflectanceArray protected () extends StObject {
  def this(opts: ReflectanceArrayOption) = this()
  
  def calibrate(): Unit = js.native
  
  def calibrateUntil(predicate: js.Function0[Unit]): Unit = js.native
  
  val calibration: Any = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  var id: String = js.native
  
  val isCalibrated: Boolean = js.native
  
  val isOn: Boolean = js.native
  
  val isOnLine: Boolean = js.native
  
  val line: Double = js.native
  
  def loadCalibration(option: LoadCalibrationOption): Unit = js.native
  
  def on(
    event: data | calibratedData | typings.johnnyFive.johnnyFiveStrings.line,
    cb: js.Function1[/* data */ Any, Unit]
  ): this.type = js.native
  
  var pins: js.Array[Double | String] = js.native
  
  val raw: js.Array[Any] = js.native
  
  val sensors: js.Array[Sensor] = js.native
  
  val values: Double | js.Array[Double] = js.native
}
