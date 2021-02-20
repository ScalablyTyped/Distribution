package typings.indefiniteObservable

import typings.indefiniteObservable.typesMod.Observer
import typings.indefiniteObservable.typesMod.ObserverOrNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapWithObserverMod {
  
  @JSImport("indefinite-observable/dist/wrapWithObserver", JSImport.Default)
  @js.native
  def default[T](listener: ObserverOrNext[T]): Observer[T] = js.native
  
  @JSImport("indefinite-observable/dist/wrapWithObserver", "wrapWithObserver")
  @js.native
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = js.native
}
