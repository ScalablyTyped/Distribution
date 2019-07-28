package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveMod.IRNs.ArrayOption
import typings.johnnyDashFive.johnnyDashFiveMod.IRNs.LoadCalibrationOption
import typings.johnnyDashFive.johnnyDashFiveStrings.calibratedData
import typings.johnnyDashFive.johnnyDashFiveStrings.data
import typings.johnnyDashFive.johnnyDashFiveStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "IR")
@js.native
object IRNs extends js.Object {
  trait ArrayOption extends js.Object {
    var emitter: Double | String
    var freq: js.UndefOr[Double] = js.undefined
    var pins: js.Array[Double | String]
  }
  
  trait LoadCalibrationOption extends js.Object {
    var max: js.Array[Double]
    var min: js.Array[Double]
  }
  
  @JSName("Reflect")
  @js.native
  object ReflectNs extends js.Object {
    @js.native
    class Array protected () extends js.Object {
      def this(option: ArrayOption) = this()
      def calibrate(): Unit = js.native
      def calibrateUntil(predicate: js.Function0[Unit]): Unit = js.native
      def disable(): Unit = js.native
      def enable(): Unit = js.native
      def loadCalibration(option: LoadCalibrationOption): Unit = js.native
      def on(event: String, cb: js.Function0[Unit]): this.type = js.native
      @JSName("on")
      def on_calibratedData(event: calibratedData, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
      @JSName("on")
      def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
      @JSName("on")
      def on_line(event: line, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    }
    
  }
  
}

