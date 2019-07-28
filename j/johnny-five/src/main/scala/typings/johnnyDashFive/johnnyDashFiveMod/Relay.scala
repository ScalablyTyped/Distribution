package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Relay")
@js.native
class Relay protected () extends js.Object {
  def this(option: Double) = this()
  def this(option: RelayOption) = this()
  var id: String = js.native
  val isOn: Boolean = js.native
  var pin: Double | String = js.native
  val `type`: String = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
  def toggle(): Unit = js.native
}

