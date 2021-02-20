package typings.indefiniteObservable

import typings.indefiniteObservable.typesMod.Connect
import typings.indefiniteObservable.typesMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indefiniteObservableMod {
  
  @JSImport("indefinite-observable/dist/IndefiniteObservable", JSImport.Default)
  @js.native
  class default[T] protected () extends IndefiniteObservable[T] {
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
  class IndefiniteObservable[T] protected () extends Observable[T] {
    /**
      * The provided function should receive an observer and connect that
      * observer's `next` method to an event source (for instance,
      * `element.addEventListener('click', observer.next)`).
      *
      * It must return a function that will disconnect the observer from the event
      * source.
      */
    def this(connect: Connect[T]) = this()
    
    var _connect: js.Any = js.native
  }
}
