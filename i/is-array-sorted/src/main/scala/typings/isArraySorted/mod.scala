package typings.isArraySorted

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Check if an array is sorted.
  @example
  ```
  import isArraySorted = require('is-array-sorted');
  isArraySorted([1, 2, 3]);
  //=> true
  isArraySorted([1, 3, 2]);
  //=> false
  isArraySorted(['a', 'b', 'c']);
  //=> true
  ```
  */
  inline def apply[T](array: js.Array[T]): Boolean = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply[T](array: js.Array[T], options: Options[T]): Boolean = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-array-sorted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options[T] extends StObject {
    
    /**
    		Same as [`Array#sort(comparator)`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Description).
    		@default (a, b) => a - b
    		*/
    def comparator(left: T, right: T): Double
  }
  object Options {
    
    inline def apply[T](comparator: (T, T) => Double): Options[T] = {
      val __obj = js.Dynamic.literal(comparator = js.Any.fromFunction2(comparator))
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setComparator(value: (T, T) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    }
  }
}
