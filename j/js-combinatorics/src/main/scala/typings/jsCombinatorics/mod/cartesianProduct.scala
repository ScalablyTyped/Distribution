package typings.jsCombinatorics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-combinatorics", "cartesianProduct")
@js.native
object cartesianProduct extends js.Object {
  
  def apply(a: js.Array[_]*): ICartesianProductGenerator[js.Array[_]] = js.native
  /**
    * Generates the cartesian product of the arrays. All arguments must be arrays with more than one element.
    */
  def apply[T1](a1: js.Array[T1]): ICartesianProductGenerator[js.Array[T1]] = js.native
  def apply[T1, T2](a1: js.Array[T1], a2: js.Array[T2]): ICartesianProductGenerator[js.Tuple2[T1, T2]] = js.native
  def apply[T1, T2, T3](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3]): ICartesianProductGenerator[js.Tuple3[T1, T2, T3]] = js.native
  def apply[T1, T2, T3, T4](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4]): ICartesianProductGenerator[js.Tuple4[T1, T2, T3, T4]] = js.native
  def apply[T1, T2, T3, T4, T5](a1: js.Array[T1], a2: js.Array[T2], a3: js.Array[T3], a4: js.Array[T4], a5: js.Array[T5]): ICartesianProductGenerator[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  def apply[T1, T2, T3, T4, T5, T6](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6]
  ): ICartesianProductGenerator[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7]
  ): ICartesianProductGenerator[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8]
  ): ICartesianProductGenerator[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8],
    a9: js.Array[T9]
  ): ICartesianProductGenerator[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
  def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    a1: js.Array[T1],
    a2: js.Array[T2],
    a3: js.Array[T3],
    a4: js.Array[T4],
    a5: js.Array[T5],
    a6: js.Array[T6],
    a7: js.Array[T7],
    a8: js.Array[T8],
    a9: js.Array[T9],
    a10: js.Array[T10]
  ): ICartesianProductGenerator[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
}
