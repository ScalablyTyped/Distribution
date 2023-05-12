package typings.jotai.anon

import typings.jotai.vanillaUtilsAtomWithObservableMod.Observer
import typings.jotai.vanillaUtilsAtomWithObservableMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscribe[T] extends StObject {
  
  def subscribe(observer: Observer[T]): Subscription
}
object Subscribe {
  
  inline def apply[T](subscribe: Observer[T] => Subscription): Subscribe[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscribe[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscribe[?], T] (val x: Self & Subscribe[T]) extends AnyVal {
    
    inline def setSubscribe(value: Observer[T] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
