package typings.justDashDebounceDashIt

import typings.justDashDebounceDashIt.justDashDebounceDashItMod.ArgumentTypes
import typings.justDashDebounceDashIt.justDashDebounceDashItNumbers.`0`
import typings.justDashDebounceDashIt.justDashDebounceDashItNumbers.`false`
import typings.justDashDebounceDashIt.justDashDebounceDashItNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("just-debounce-it", JSImport.Namespace)
@js.native
object justDashDebounceDashItMod extends js.Object {
  def apply[T /* <: js.Function */](fn: T): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: Double): js.Function1[/* args */ ArgumentTypes[T], Unit] = js.native
  def apply[T /* <: js.Function */](fn: T, wait: Double, callFirst: `false`): js.Function1[/* args */ ArgumentTypes[T], Unit] = js.native
  def apply[T /* <: js.Function */](fn: T, wait: Double, callFirst: `true`): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: `0`): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: `0`, callFirst: Boolean): T = js.native
  type ArgumentTypes[F /* <: js.Function */] = js.Any
}

