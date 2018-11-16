package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Relay")
@js.native
class Relay protected () extends js.Object {
  def this(option: RelayOption) = this()
  def this(option: scala.Double) = this()
  var id: java.lang.String = js.native
  val isOn: scala.Boolean = js.native
  var pin: scala.Double | java.lang.String = js.native
  val `type`: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
}

