package typings.isPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, S](obj: S): /* is std.PromiseLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<T> */ Boolean]
  inline def default[T, S](obj: js.Thenable[T]): /* is std.PromiseLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<T> */ Boolean]
}
