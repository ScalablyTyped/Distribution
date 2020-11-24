package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/array", "ArrayExt.removeAllWhere")
@js.native
object removeAllWhere extends js.Object {
  
  /**
    * Remove all occurrences of values which match a predicate.
    *
    * @param array - The array of interest.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The number of elements removed from the array.
    *
    * #### Notes
    * If `stop < start` the search will conceptually wrap at the end of
    * the array, however the array will be traversed front-to-back.
    *
    * #### Complexity
    * Linear.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@lumino/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * function isNegative(value: number): boolean {
    *   return value < 0;
    * }
    *
    * let data = [0, 12, -13, -9, 23, 39, 14, -15, 12, 75];
    * ArrayExt.removeAllWhere(data, isEven);            // 4
    * ArrayExt.removeAllWhere(data, isNegative, 0, 3);  // 2
    * ```
    */
  def apply[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
  def apply[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
    start: js.UndefOr[scala.Nothing],
    stop: Double
  ): Double = js.native
  def apply[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = js.native
  def apply[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
    start: Double,
    stop: Double
  ): Double = js.native
}
