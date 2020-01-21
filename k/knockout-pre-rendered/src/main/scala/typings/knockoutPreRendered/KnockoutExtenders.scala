package typings.knockoutPreRendered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutExtenders extends js.Object {
  def notify(target: js.Any, notifyWhen: String): js.Any = js.native
  def rateLimit(target: js.Any, options: AnonMethod): js.Any = js.native
  def rateLimit(target: js.Any, timeout: Double): js.Any = js.native
  def throttle(target: js.Any, timeout: Double): KnockoutComputed[_] = js.native
  def trackArrayChanges(target: js.Any): js.Any = js.native
}

