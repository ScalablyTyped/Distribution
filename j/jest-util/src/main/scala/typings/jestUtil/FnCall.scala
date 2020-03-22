package typings.jestUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(): js.UndefOr[String] = js.native
  def apply(descriptor: String): String = js.native
  def apply(descriptor: js.Function): js.Function | String = js.native
  def apply(descriptor: Double): Double | String = js.native
}

