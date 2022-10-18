package typings.indefiniteObservable

import typings.indefiniteObservable.distTypesMod.Observer
import typings.indefiniteObservable.distTypesMod.ObserverOrNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWrapWithObserverMod {
  
  @JSImport("indefinite-observable/dist/wrapWithObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](listener: ObserverOrNext[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(listener.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  
  inline def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapWithObserver")(listener.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
}
