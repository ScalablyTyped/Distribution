package typings.indefiniteObservable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Connect[T] = js.Function1[/* observer */ Observer[T], Disconnect]
  
  type Disconnect = js.Function0[Unit]
  
  type NextChannel[T] = js.Function1[/* value */ T, Unit]
  
  @js.native
  trait Observable[T] extends StObject {
    
    def subscribe(observerOrNext: ObserverOrNext[T]): Subscription = js.native
  }
  object Observable {
    
    @scala.inline
    def apply[T](subscribe: ObserverOrNext[T] => Subscription): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit class ObservableMutableBuilder[Self <: Observable[_], T] (val x: Self with Observable[T]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: ObserverOrNext[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Observer[T] extends StObject {
    
    def next(value: T): Unit = js.native
    @JSName("next")
    var next_Original: NextChannel[T] = js.native
  }
  
  type ObserverOrNext[T] = Observer[T] | NextChannel[T]
  
  @js.native
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit = js.native
    @JSName("unsubscribe")
    var unsubscribe_Original: Unsubscribe = js.native
  }
  
  type Unsubscribe = js.Function0[Unit]
}
