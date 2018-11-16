package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Servo")
@js.native
class Servo protected () extends js.Object {
  def this(option: java.lang.String) = this()
  def this(option: ServoGeneralOption) = this()
  def this(option: scala.Double) = this()
  var history: js.Array[_] = js.native
  var id: java.lang.String = js.native
  var interval: scala.Double = js.native
  var invert: scala.Boolean = js.native
  var isMoving: scala.Boolean = js.native
  val last: js.Any = js.native
  var pin: scala.Double | java.lang.String = js.native
  val position: scala.Double = js.native
  var range: js.Array[scala.Double] = js.native
  var startAt: scala.Double = js.native
  var value: scala.Double = js.native
  def ccw(speed: scala.Double): scala.Unit = js.native
  def center(): scala.Unit = js.native
  def cw(speed: scala.Double): scala.Unit = js.native
  def home(): scala.Unit = js.native
  def max(): scala.Unit = js.native
  def min(): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def `on_move:complete`(event: johnnyDashFiveLib.johnnyDashFiveLibStrings.`move:complete`, cb: js.Function0[scala.Unit]): this.type = js.native
  def stop(): scala.Unit = js.native
  def sweep(): scala.Unit = js.native
  def sweep(opt: ServoSweepOpts): scala.Unit = js.native
  def sweep(range: js.Array[scala.Double]): scala.Unit = js.native
  def to(degrees: scala.Double): scala.Unit = js.native
  def to(degrees: scala.Double, ms: scala.Double): scala.Unit = js.native
  def to(degrees: scala.Double, ms: scala.Double, rage: scala.Double): scala.Unit = js.native
}

