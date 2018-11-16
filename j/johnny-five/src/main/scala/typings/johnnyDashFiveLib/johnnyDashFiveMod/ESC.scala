package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "ESC")
@js.native
class ESC protected () extends js.Object {
  def this(option: java.lang.String) = this()
  def this(option: ESCOption) = this()
  def this(option: scala.Double) = this()
  var id: java.lang.String = js.native
  var pin: scala.Double | java.lang.String = js.native
  var range: js.Array[scala.Double] = js.native
  val value: scala.Double = js.native
  def max(): scala.Unit = js.native
  def min(): scala.Unit = js.native
  def speed(value: scala.Double): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

