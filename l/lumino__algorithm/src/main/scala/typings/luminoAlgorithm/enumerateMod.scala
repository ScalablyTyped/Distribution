package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumerateMod {
  
  @JSImport("@lumino/algorithm/types/enumerate", "EnumerateIterator")
  @js.native
  class EnumerateIterator[T] protected ()
    extends IIterator[js.Tuple2[Double, T]] {
    /**
      * Construct a new enumerate iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param start - The starting enum value.
      */
    def this(source: IIterator[T], start: Double) = this()
    
    var _index: js.Any = js.native
    
    var _source: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/enumerate", "enumerate")
  @js.native
  def enumerate[T](`object`: IterableOrArrayLike[T]): IIterator[js.Tuple2[Double, T]] = js.native
  @JSImport("@lumino/algorithm/types/enumerate", "enumerate")
  @js.native
  def enumerate[T](`object`: IterableOrArrayLike[T], start: Double): IIterator[js.Tuple2[Double, T]] = js.native
}
