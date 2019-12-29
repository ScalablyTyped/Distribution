package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.moveColoncomplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Servo")
@js.native
class Servo protected () extends js.Object {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: ServoGeneralOption) = this()
  var history: js.Array[_] = js.native
  var id: String = js.native
  var interval: Double = js.native
  var invert: Boolean = js.native
  var isMoving: Boolean = js.native
  val last: js.Any = js.native
  var pin: Double | String = js.native
  val position: Double = js.native
  var range: js.Array[Double] = js.native
  var startAt: Double = js.native
  var value: Double = js.native
  def ccw(speed: Double): Unit = js.native
  def center(): Unit = js.native
  def cw(speed: Double): Unit = js.native
  def home(): Unit = js.native
  def max(): Unit = js.native
  def min(): Unit = js.native
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_movecomplete(event: moveColoncomplete, cb: js.Function0[Unit]): this.type = js.native
  def stop(): Unit = js.native
  def sweep(): Unit = js.native
  def sweep(opt: ServoSweepOpts): Unit = js.native
  def sweep(range: js.Array[Double]): Unit = js.native
  def to(degrees: Double): Unit = js.native
  def to(degrees: Double, ms: Double): Unit = js.native
  def to(degrees: Double, ms: Double, rage: Double): Unit = js.native
}

