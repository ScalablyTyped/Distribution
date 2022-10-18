package typings.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("lib0/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _insertionSort[T](
    arr: js.Array[T],
    lo: Double,
    hi: Double,
    compare: js.Function2[/* arg0 */ T, /* arg1 */ T, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_insertionSort")(arr.asInstanceOf[js.Any], lo.asInstanceOf[js.Any], hi.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertionSort[T](arr: js.Array[T], compare: js.Function2[/* arg0 */ T, /* arg1 */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertionSort")(arr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def quicksort[T](arr: js.Array[T], compare: js.Function2[/* arg0 */ T, /* arg1 */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quicksort")(arr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
