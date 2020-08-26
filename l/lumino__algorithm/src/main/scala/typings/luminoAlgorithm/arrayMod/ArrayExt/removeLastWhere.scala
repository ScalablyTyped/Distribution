package typings.luminoAlgorithm.arrayMod.ArrayExt

import typings.luminoAlgorithm.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/array", "ArrayExt.removeLastWhere")
@js.native
object removeLastWhere extends js.Object {
  /**
    * Remove the last occurrence of a value which matches a predicate.
    *
    * @param array - The array of interest.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The removed `{ index, value }`, which will be `-1` and
    *   `undefined` if the value is not contained in the array.
    *
    * #### Notes
    * If `start < stop` the search will wrap at the end of the array.
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
    * let data = [0, 12, 23, 39, 14, 12, 75];
    * ArrayExt.removeLastWhere(data, isEven);        // { index: 5, value: 12 }
    * ArrayExt.removeLastWhere(data, isEven, 2);     // { index: 1, value: 12 }
    * ArrayExt.removeLastWhere(data, isEven, 2, 1);  // { index: -1, value: undefined }
    * ```
    */
  def apply[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Index[T] = js.native
  def apply[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
    start: js.UndefOr[scala.Nothing],
    stop: Double
  ): Index[T] = js.native
  def apply[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Index[T] = js.native
  def apply[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
    start: Double,
    stop: Double
  ): Index[T] = js.native
}

