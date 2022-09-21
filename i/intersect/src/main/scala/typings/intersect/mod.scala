package typings.intersect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Find the intersection of arrays a and b.
    * The individual arrays are expected to be sets, i.e. there's no duplicate elements in them.
    */
  inline def apply[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  /**
    * Find the intersection of all subarrays.
    * The individual arrays are expected to be sets, i.e. there's no duplicate elements in them.
    */
  inline def apply[T](arrays: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(arrays.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @JSImport("intersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Find the intersection of two large arrays.
    * May perform better than default when there are over approximately 125 elements
    */
  inline def big[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("big")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
