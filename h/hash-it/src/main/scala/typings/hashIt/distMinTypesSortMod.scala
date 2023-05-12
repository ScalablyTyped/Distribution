package typings.hashIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMinTypesSortMod {
  
  @JSImport("hash-it/dist/min/types/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sort(array: js.Array[Any], fn: js.Function2[/* item */ Any, /* comparisonItem */ Any, Boolean]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def sortByKey(first: js.Tuple2[String, String], second: js.Tuple2[String, String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sortByKey")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sortBySelf(first: String, second: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBySelf")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
