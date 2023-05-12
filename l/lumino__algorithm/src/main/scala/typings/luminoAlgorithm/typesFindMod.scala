package typings.luminoAlgorithm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFindMod {
  
  @JSImport("@lumino/algorithm/types/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find[T](`object`: js.Iterable[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findIndex[T](`object`: js.Iterable[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def max[T](`object`: js.Iterable[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def min[T](`object`: js.Iterable[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def minmax[T](`object`: js.Iterable[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[js.Tuple2[T, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("minmax")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[T, T]]]
}
