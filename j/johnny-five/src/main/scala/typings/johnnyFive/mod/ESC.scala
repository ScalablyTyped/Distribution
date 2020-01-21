package typings.johnnyFive.mod

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
  var pwmRange: js.Array[Double] = js.native
  val value: Double = js.native
  def brake(): this.type = js.native
  def throttle(value: Double): this.type = js.native
}

/* static members */
@JSImport("johnny-five", "ESC")
@js.native
object ESC extends js.Object {
  var Collection: ESCs = js.native
}

