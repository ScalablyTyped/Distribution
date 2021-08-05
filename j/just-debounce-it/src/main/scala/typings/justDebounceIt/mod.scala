package typings.justDebounceIt

import typings.justDebounceIt.justDebounceItBooleans.`false`
import typings.justDebounceIt.justDebounceItBooleans.`true`
import typings.justDebounceIt.justDebounceItNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Function */](fn: T): T = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T /* <: js.Function */](fn: T, wait: Double): js.Function1[/* args */ ArgumentTypes[T], Unit] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ ArgumentTypes[T], Unit]]
  inline def apply[T /* <: js.Function */](fn: T, wait: Double, callFirst: `false`): js.Function1[/* args */ ArgumentTypes[T], Unit] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ ArgumentTypes[T], Unit]]
  inline def apply[T /* <: js.Function */](fn: T, wait: Double, callFirst: `true`): T = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: js.Function */](fn: T, wait: Unit, callFirst: Boolean): T = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: js.Function */](fn: T, wait: `0`): T = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: js.Function */](fn: T, wait: `0`, callFirst: Boolean): T = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("just-debounce-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ArgumentTypes[F /* <: js.Function */] = js.Any
}
