package typings.isArraySorted

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("is-array-sorted", JSImport.Namespace)
  @js.native
  def apply[T](array: js.Array[T]): Boolean = js.native
  @JSImport("is-array-sorted", JSImport.Namespace)
  @js.native
  def apply[T](array: js.Array[T], options: Options[T]): Boolean = js.native
  
  @js.native
  trait Options[T] extends StObject {
    
    /**
    		Same as [`Array#sort(comparator)`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Description).
    		@default (a, b) => a - b
    		*/
    def comparator(left: T, right: T): Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T](comparator: (T, T) => Double): Options[T] = {
      val __obj = js.Dynamic.literal(comparator = js.Any.fromFunction2(comparator))
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setComparator(value: (T, T) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    }
  }
}
