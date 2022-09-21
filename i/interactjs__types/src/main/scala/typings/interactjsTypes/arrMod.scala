package typings.interactjsTypes

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrMod {
  
  @JSImport("@interactjs/utils/arr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains[T](array: js.Array[T], target: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def find[T](array: js.Array[T], func: Filter[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findIndex[T](array: js.Array[T], func: Filter[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(array.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def from[T](source: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def merge[T, U](target: js.Array[T | U], source: js.Array[U]): js.Array[T | U] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Array[T | U]]
  
  inline def remove[T](array: js.Array[T], target: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  type Filter[T] = js.Function3[/* element */ T, /* index */ Double, /* array */ js.Array[T], Boolean]
}
