package typings.justThrottle

import typings.justThrottle.justThrottleBooleans.`false`
import typings.justThrottle.justThrottleBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], interval: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def apply(fn: js.Function1[/* repeated */ js.Any, js.Any], interval: Double, callFirst: `false`): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def apply[T](fn: T, interval: Double): T = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T](fn: T, interval: Double, callFirst: `true`): T = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("just-throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
