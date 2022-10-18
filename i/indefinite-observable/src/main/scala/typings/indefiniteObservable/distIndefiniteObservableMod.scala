package typings.indefiniteObservable

import typings.indefiniteObservable.distTypesMod.Connect
import typings.indefiniteObservable.distTypesMod.Observable
import typings.indefiniteObservable.distTypesMod.ObserverOrNext
import typings.indefiniteObservable.distTypesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIndefiniteObservableMod {
  
  @JSImport("indefinite-observable/dist/IndefiniteObservable", JSImport.Default)
  @js.native
  open class default[T] protected () extends IndefiniteObservable[T] {
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
  
  @JSImport("indefinite-observable/dist/IndefiniteObservable", "IndefiniteObservable")
  @js.native
  open class IndefiniteObservable[T] protected ()
    extends StObject
       with Observable[T] {
    /**
      * The provided function should receive an observer and connect that
      * observer's `next` method to an event source (for instance,
      * `element.addEventListener('click', observer.next)`).
      *
      * It must return a function that will disconnect the observer from the event
      * source.
      */
    def this(connect: Connect[T]) = this()
    
    /* private */ var _connect: Any = js.native
    
    /* CompleteClass */
    override def subscribe(observerOrNext: ObserverOrNext[T]): Subscription = js.native
  }
}
