package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findMod {
  
  @JSImport("@lumino/algorithm/types/find", "find")
  @js.native
  def find[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  
  @JSImport("@lumino/algorithm/types/find", "findIndex")
  @js.native
  def findIndex[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
  
  @JSImport("@lumino/algorithm/types/find", "max")
  @js.native
  def max[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  
  @JSImport("@lumino/algorithm/types/find", "min")
  @js.native
  def min[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = js.native
  
  @JSImport("@lumino/algorithm/types/find", "minmax")
  @js.native
  def minmax[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[js.Tuple2[T, T]] = js.native
}
