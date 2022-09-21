package typings.jsSdsl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def size(): Double
  }
  object `0` {
    
    inline def apply(size: () => Double): `0` = {
      val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
  
  trait ForEach[T] extends StObject {
    
    def forEach(callback: js.Function1[/* element */ T, Unit]): Unit
  }
  object ForEach {
    
    inline def apply[T](forEach: js.Function1[/* element */ T, Unit] => Unit): ForEach[T] = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
      __obj.asInstanceOf[ForEach[T]]
    }
    
    extension [Self <: ForEach[?], T](x: Self & ForEach[T]) {
      
      inline def setForEach(value: js.Function1[/* element */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
  }
  object Length {
    
    inline def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var size: Double
  }
  object Size {
    
    inline def apply(size: Double): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
