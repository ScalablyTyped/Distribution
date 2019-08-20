package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "ESCs")
@js.native
class ESCs protected () extends Collection[ESC] {
  def this(option: js.Array[Double | String | ESCOption]) = this()
  def brake(): this.type = js.native
  def throttle(value: Double): this.type = js.native
}

