package typings.luminoPolling

import typings.luminoPolling.mod.IPoll.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel[T, U, V /* <: String */] extends StObject {
    
    def cancel(last: State[T, U, V]): Boolean
  }
  object Cancel {
    
    inline def apply[T, U, V /* <: String */](cancel: State[T, U, V] => Boolean): Cancel[T, U, V] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel))
      __obj.asInstanceOf[Cancel[T, U, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel[?, ?, ?], T, U, V /* <: String */] (val x: Self & (Cancel[T, U, V])) extends AnyVal {
      
      inline def setCancel(value: State[T, U, V] => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@lumino/polling.@lumino/polling.IPoll.Frequency> */
  trait PartialFrequency extends StObject {
    
    var backoff: js.UndefOr[Boolean | Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
  }
  object PartialFrequency {
    
    inline def apply(): PartialFrequency = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFrequency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFrequency] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: Boolean | Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
}
