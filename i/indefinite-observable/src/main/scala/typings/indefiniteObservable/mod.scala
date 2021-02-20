package typings.indefiniteObservable

import typings.indefiniteObservable.indefiniteObservableMod.default
import typings.indefiniteObservable.typesMod.Connect
import typings.indefiniteObservable.typesMod.Observer
import typings.indefiniteObservable.typesMod.ObserverOrNext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("indefinite-observable", "IndefiniteObservable")
  @js.native
  class IndefiniteObservable[T] protected () extends default[T] {
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
  
  @JSImport("indefinite-observable", "wrapWithObserver")
  @js.native
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = js.native
}
