package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform3x4[T] extends js.Object {
  def apply[TResult](iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]]): LodashTransform3x5[TResult] = js.native
  def apply[TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]],
    accumulator: js.Array[TResult]
  ): js.Array[TResult] = js.native
  def apply[TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]],
    accumulator: lodashLib.lodashMod.Dictionary[TResult]
  ): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply[TResult](iteratee: lodashLib.lodashMod.__, accumulator: js.Array[TResult]): LodashTransform4x6[T, TResult] = js.native
  def apply[TResult](iteratee: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.Dictionary[TResult]): LodashTransform3x6[T, TResult] = js.native
}

