package typings
package justDashDebounceDashItLib.justDashDebounceDashItMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("just-debounce-it", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: js.Function */](fn: T): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: justDashDebounceDashItLib.justDashDebounceDashItLibNumbers.`0`): T = js.native
  def apply[T /* <: js.Function */](
    fn: T,
    wait: justDashDebounceDashItLib.justDashDebounceDashItLibNumbers.`0`,
    callFirst: scala.Boolean
  ): T = js.native
  def apply[T /* <: js.Function */](fn: T, wait: scala.Double): js.Function1[/* args */ ArgumentTypes[T], scala.Unit] = js.native
  def apply[T /* <: js.Function */](
    fn: T,
    wait: scala.Double,
    callFirst: justDashDebounceDashItLib.justDashDebounceDashItLibNumbers.`false`
  ): js.Function1[/* args */ ArgumentTypes[T], scala.Unit] = js.native
  def apply[T /* <: js.Function */](
    fn: T,
    wait: scala.Double,
    callFirst: justDashDebounceDashItLib.justDashDebounceDashItLibNumbers.`true`
  ): T = js.native
}

