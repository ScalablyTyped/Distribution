package typings.indefiniteObservable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Connect[T] = js.Function1[/* observer */ Observer[T], Disconnect]
  
  type Disconnect = js.Function0[Unit]
  
  type NextChannel[T] = js.Function1[/* value */ T, Unit]
  
  trait Observable[T] extends StObject {
    
    def subscribe(observerOrNext: ObserverOrNext[T]): Subscription
  }
  object Observable {
    
    @scala.inline
    def apply[T](subscribe: ObserverOrNext[T] => Subscription): Observable[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Observable[T]]
    }
    
    @scala.inline
    implicit class ObservableMutableBuilder[Self <: Observable[?], T] (val x: Self & Observable[T]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: ObserverOrNext[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  trait Observer[T] extends StObject {
    
    def next(value: T): Unit
    @JSName("next")
    var next_Original: NextChannel[T]
  }
  object Observer {
    
    @scala.inline
    def apply[T](next: T => Unit): Observer[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  type ObserverOrNext[T] = Observer[T] | NextChannel[T]
  
  trait Subscription extends StObject {
    
    def unsubscribe(): Unit
    @JSName("unsubscribe")
    var unsubscribe_Original: Unsubscribe
  }
  object Subscription {
    
    @scala.inline
    def apply(unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  type Unsubscribe = js.Function0[Unit]
}
