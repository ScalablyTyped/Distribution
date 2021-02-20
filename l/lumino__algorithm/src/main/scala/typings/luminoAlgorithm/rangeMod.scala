package typings.luminoAlgorithm

import typings.luminoAlgorithm.iterMod.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@lumino/algorithm/types/range", "RangeIterator")
  @js.native
  class RangeIterator protected () extends IIterator[Double] {
    /**
      * Construct a new range iterator.
      *
      * @param start - The starting value for the range, inclusive.
      *
      * @param stop - The stopping value for the range, exclusive.
      *
      * @param step - The distance between each value.
      */
    def this(start: Double, stop: Double, step: Double) = this()
    
    var _index: js.Any = js.native
    
    var _length: js.Any = js.native
    
    var _start: js.Any = js.native
    
    var _step: js.Any = js.native
    
    var _stop: js.Any = js.native
  }
  
  @JSImport("@lumino/algorithm/types/range", "range")
  @js.native
  def range(start: Double): IIterator[Double] = js.native
  @JSImport("@lumino/algorithm/types/range", "range")
  @js.native
  def range(start: Double, stop: js.UndefOr[scala.Nothing], step: Double): IIterator[Double] = js.native
  @JSImport("@lumino/algorithm/types/range", "range")
  @js.native
  def range(start: Double, stop: Double): IIterator[Double] = js.native
  @JSImport("@lumino/algorithm/types/range", "range")
  @js.native
  def range(start: Double, stop: Double, step: Double): IIterator[Double] = js.native
}
