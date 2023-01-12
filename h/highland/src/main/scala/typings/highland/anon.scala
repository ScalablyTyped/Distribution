package typings.highland

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Array[R] extends StObject {
    
    var array: /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Array<infer U> ? highland.Flattened<U> : never */ js.Any
    
    var stream: /* import warning: importer.ImportType#apply Failed type conversion: R extends highland.Highland.Stream<infer U> ? highland.Flattened<U> : never */ js.Any
    
    var value: R
  }
  object Array {
    
    inline def apply[R](
      array: /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Array<infer U> ? highland.Flattened<U> : never */ js.Any,
      stream: /* import warning: importer.ImportType#apply Failed type conversion: R extends highland.Highland.Stream<infer U> ? highland.Flattened<U> : never */ js.Any,
      value: R
    ): Array[R] = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Array[R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Array[?], R] (val x: Self & Array[R]) extends AnyVal {
      
      inline def setArray(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends std.Array<infer U> ? highland.Flattened<U> : never */ js.Any
      ): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setStream(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends highland.Highland.Stream<infer U> ? highland.Flattened<U> : never */ js.Any
      ): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setValue(value: R): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
