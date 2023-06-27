package typings.makeCancellablePromise

import typings.makeCancellablePromise.anon.Cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("make-cancellable-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](promise: js.Promise[T]): Cancel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any]).asInstanceOf[Cancel[T]]
}
