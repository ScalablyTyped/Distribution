package typings.jotai.anon

import typings.jotai.vanillaUtilsAtomWithObservableMod.Observer
import typings.jotai.vanillaUtilsAtomWithObservableMod.Subscription
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T] extends StObject {
  
  def subscribe(observer: Partial[Observer[T]]): Subscription
}
object `0` {
  
  inline def apply[T](subscribe: Partial[Observer[T]] => Subscription): `0`[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[`0`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`[?], T] (val x: Self & `0`[T]) extends AnyVal {
    
    inline def setSubscribe(value: Partial[Observer[T]] => Subscription): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
