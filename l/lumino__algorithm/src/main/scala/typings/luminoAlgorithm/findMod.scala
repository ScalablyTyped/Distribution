package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findMod {
  
  @JSImport("@lumino/algorithm/types/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def find[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def findIndex[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def max[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def min[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def minmax[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[js.Tuple2[T, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("minmax")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[T, T]]]
}
