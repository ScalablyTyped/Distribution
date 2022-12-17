package typings.indefiniteObservable

import typings.indefiniteObservable.distIndefiniteObservableMod.default
import typings.indefiniteObservable.distTypesMod.Connect
import typings.indefiniteObservable.distTypesMod.Observer
import typings.indefiniteObservable.distTypesMod.ObserverOrNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("indefinite-observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("indefinite-observable", "IndefiniteObservable")
  @js.native
  open class IndefiniteObservable[T] protected () extends default[T] {
    /**
      * The provided function should receive an observer and connect that
      * observer's `next` method to an event source (for instance,
      * `element.addEventListener('click', observer.next)`).
      *
      * It must return a function that will disconnect the observer from the event
      * source.
      */
    def this(connect: Connect[T]) = this()
  }
  
  inline def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapWithObserver")(listener.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
}
