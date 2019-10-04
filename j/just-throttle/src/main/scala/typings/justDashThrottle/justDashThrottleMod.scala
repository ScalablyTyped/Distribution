package typings.justDashThrottle

import typings.justDashThrottle.justDashThrottleNumbers.`false`
import typings.justDashThrottle.justDashThrottleNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("just-throttle", JSImport.Namespace)
@js.native
object justDashThrottleMod extends js.Object {
  def apply(fn: js.Function1[/* repeated */ js.Any, _], interval: Double): js.Function0[Unit] = js.native
  def apply(fn: js.Function1[/* repeated */ js.Any, _], interval: Double, callFirst: `false`): js.Function0[Unit] = js.native
  def apply[T](fn: T, interval: Double): T = js.native
  def apply[T](fn: T, interval: Double, callFirst: `true`): T = js.native
}

