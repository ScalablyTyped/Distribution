package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "IR")
@js.native
object IRNs extends js.Object {
  trait ArrayOption extends js.Object {
    var emitter: scala.Double | java.lang.String
    var freq: js.UndefOr[scala.Double] = js.undefined
    var pins: js.Array[scala.Double | java.lang.String]
  }
  
  trait LoadCalibrationOption extends js.Object {
    var max: js.Array[scala.Double]
    var min: js.Array[scala.Double]
  }
  
  @JSName("Reflect")
  @js.native
  object ReflectNs extends js.Object {
    @js.native
    class Array protected () extends js.Object {
      def this(option: johnnyDashFiveLib.johnnyDashFiveMod.IRNs.ArrayOption) = this()
      def calibrate(): scala.Unit = js.native
      def calibrateUntil(predicate: js.Function0[scala.Unit]): scala.Unit = js.native
      def disable(): scala.Unit = js.native
      def enable(): scala.Unit = js.native
      def loadCalibration(option: johnnyDashFiveLib.johnnyDashFiveMod.IRNs.LoadCalibrationOption): scala.Unit = js.native
      def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
      @JSName("on")
      def on_calibratedData(
        event: johnnyDashFiveLib.johnnyDashFiveLibStrings.calibratedData,
        cb: js.Function1[/* data */ js.Any, scala.Unit]
      ): this.type = js.native
      @JSName("on")
      def on_data(
        event: johnnyDashFiveLib.johnnyDashFiveLibStrings.data,
        cb: js.Function1[/* data */ js.Any, scala.Unit]
      ): this.type = js.native
      @JSName("on")
      def on_line(
        event: johnnyDashFiveLib.johnnyDashFiveLibStrings.line,
        cb: js.Function1[/* data */ js.Any, scala.Unit]
      ): this.type = js.native
    }
    
  }
  
}

