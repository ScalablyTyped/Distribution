package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform extends js.Object {
  def apply[TResult](iteratee: lodashLib.lodashMod.__, accumulator: js.Array[TResult]): LodashTransform1x2[TResult] = js.native
  def apply[TResult](iteratee: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.Dictionary[TResult]): LodashTransform2x2[TResult] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, accumulator: lodashLib.lodashMod.__, `object`: js.Array[T]): LodashTransform1x4[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.__,
    accumulator: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): LodashTransform3x4[T] = js.native
  def apply[T, TResult](iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]]): LodashTransform2x1[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]],
    accumulator: js.Array[TResult]
  ): LodashTransform1x3[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]],
    accumulator: js.Array[TResult],
    `object`: js.Array[T]
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]],
    accumulator: js.Array[TResult],
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]],
    accumulator: lodashLib.lodashMod.Dictionary[TResult]
  ): LodashTransform2x3[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]],
    accumulator: lodashLib.lodashMod.Dictionary[TResult],
    `object`: js.Array[T]
  ): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]],
    accumulator: lodashLib.lodashMod.Dictionary[TResult],
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]],
    accumulator: lodashLib.lodashMod.__,
    `object`: js.Array[T]
  ): LodashTransform2x5[TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]],
    accumulator: lodashLib.lodashMod.__,
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): LodashTransform3x5[TResult] = js.native
  def apply[T, TResult](iteratee: lodashLib.lodashMod.__, accumulator: js.Array[TResult], `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.__,
    accumulator: js.Array[TResult],
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): LodashTransform4x6[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.__,
    accumulator: lodashLib.lodashMod.Dictionary[TResult],
    `object`: js.Array[T]
  ): LodashTransform2x6[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: lodashLib.lodashMod.__,
    accumulator: lodashLib.lodashMod.Dictionary[TResult],
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): LodashTransform3x6[T, TResult] = js.native
}

