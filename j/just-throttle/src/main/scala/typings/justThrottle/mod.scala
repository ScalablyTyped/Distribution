package typings.justThrottle

import typings.justThrottle.justThrottleBooleans.`false`
import typings.justThrottle.justThrottleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("just-throttle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(fn: js.Function1[/* repeated */ js.Any, _], interval: Double): js.Function0[Unit] = js.native
  def apply(fn: js.Function1[/* repeated */ js.Any, _], interval: Double, callFirst: `false`): js.Function0[Unit] = js.native
  def apply[T](fn: T, interval: Double): T = js.native
  def apply[T](fn: T, interval: Double, callFirst: `true`): T = js.native
}
