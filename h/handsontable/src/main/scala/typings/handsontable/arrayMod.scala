package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("handsontable/helpers/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayAvg(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayAvg")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayEach(
    array: js.Array[Any],
    iteratee: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEach")(array.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def arrayFilter(
    array: js.Array[Any],
    predicate: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFilter")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def arrayFlatten(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayFlatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def arrayMap(
    array: js.Array[Any],
    iteratee: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMap")(array.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def arrayMax(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMax")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayMin(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayMin")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayReduce(
    array: js.Array[Any],
    iteratee: js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit],
    accumulator: Any,
    initFromArray: Boolean
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayReduce")(array.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], accumulator.asInstanceOf[js.Any], initFromArray.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def arraySum(array: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arraySum")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def arrayUnique(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnique")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def extendArray(arr: js.Array[Any], `extension`: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendArray")(arr.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDifferenceOfArrays(arrays: (js.Array[String | Double])*): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDifferenceOfArrays")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Double | String]]
  
  inline def getIntersectionOfArrays(arrays: (js.Array[String | Double])*): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntersectionOfArrays")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Double | String]]
  
  inline def getUnionOfArrays(arrays: (js.Array[String | Double])*): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnionOfArrays")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Double | String]]
  
  inline def pivot(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pivot")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def stringToArray(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def stringToArray(value: String, delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(value.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def stringToArray(value: String, delimiter: js.RegExp): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(value.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def to2dArray(arr: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("to2dArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
