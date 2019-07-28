package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "ESC")
@js.native
class ESC protected () extends js.Object {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: ESCOption) = this()
  var id: String = js.native
  var pin: Double | String = js.native
  var range: js.Array[Double] = js.native
  val value: Double = js.native
  def max(): Unit = js.native
  def min(): Unit = js.native
  def speed(value: Double): Unit = js.native
  def stop(): Unit = js.native
}

