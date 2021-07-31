package typings.indefiniteObservable

import typings.indefiniteObservable.typesMod.Observer
import typings.indefiniteObservable.typesMod.ObserverOrNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapWithObserverMod {
  
  @JSImport("indefinite-observable/dist/wrapWithObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](listener: ObserverOrNext[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(listener.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  
  @scala.inline
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapWithObserver")(listener.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
}
