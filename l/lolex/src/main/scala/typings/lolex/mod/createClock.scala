package typings.lolex.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lolex", "createClock")
@js.native
object createClock extends js.Object {
  def apply[TClock /* <: Clock */](): TClock = js.native
  def apply[TClock /* <: Clock */](now: js.UndefOr[scala.Nothing], loopLimit: Double): TClock = js.native
  def apply[TClock /* <: Clock */](now: Double): TClock = js.native
  def apply[TClock /* <: Clock */](now: Double, loopLimit: Double): TClock = js.native
  def apply[TClock /* <: Clock */](now: Date): TClock = js.native
  def apply[TClock /* <: Clock */](now: Date, loopLimit: Double): TClock = js.native
}

