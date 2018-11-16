package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform1x4[T] extends js.Object {
  def apply[TResult](
    iteratee: lodashLib.lodashMod.underscoreNs.MemoVoidIteratorCapped[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]]
  ): LodashTransform2x5[TResult] = js.native
  def apply[TResult](
    iteratee: lodashLib.lodashMod.underscoreNs.MemoVoidIteratorCapped[T, js.Array[TResult]],
    accumulator: js.Array[TResult]
  ): js.Array[TResult] = js.native
  def apply[TResult](
    iteratee: lodashLib.lodashMod.underscoreNs.MemoVoidIteratorCapped[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]],
    accumulator: lodashLib.lodashMod.underscoreNs.Dictionary[TResult]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[TResult] = js.native
  def apply[TResult](iteratee: lodashLib.lodashMod.underscoreNs.`__`, accumulator: js.Array[TResult]): LodashTransform1x6[T, TResult] = js.native
  def apply[TResult](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    accumulator: lodashLib.lodashMod.underscoreNs.Dictionary[TResult]
  ): LodashTransform2x6[T, TResult] = js.native
}

