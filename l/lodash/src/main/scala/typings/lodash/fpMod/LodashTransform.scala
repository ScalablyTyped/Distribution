package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.MemoVoidIteratorCapped
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform extends LodashConvertible {
  def apply[TResult](iteratee: __, accumulator: js.Array[TResult]): LodashTransform1x2[TResult] = js.native
  def apply[TResult](iteratee: __, accumulator: Dictionary[TResult]): LodashTransform2x2[TResult] = js.native
  def apply[T](iteratee: __, accumulator: __, `object`: js.Array[T]): LodashTransform1x4[T] = js.native
  def apply[T](iteratee: __, accumulator: __, `object`: Dictionary[T]): LodashTransform3x4[T] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]]): LodashTransform2x1[T, TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], accumulator: js.Array[TResult]): LodashTransform1x3[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]],
    accumulator: js.Array[TResult],
    `object`: js.Array[T]
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]],
    accumulator: js.Array[TResult],
    `object`: Dictionary[T]
  ): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]], accumulator: Dictionary[TResult]): LodashTransform2x3[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]],
    accumulator: Dictionary[TResult],
    `object`: js.Array[T]
  ): Dictionary[TResult] = js.native
  def apply[T, TResult](
    iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]],
    accumulator: Dictionary[TResult],
    `object`: Dictionary[T]
  ): Dictionary[TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]], accumulator: __, `object`: Dictionary[T]): LodashTransform3x5[TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: js.Array[TResult], `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: js.Array[TResult], `object`: Dictionary[T]): LodashTransform4x6[T, TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: Dictionary[TResult], `object`: js.Array[T]): LodashTransform2x6[T, TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: Dictionary[TResult], `object`: Dictionary[T]): LodashTransform3x6[T, TResult] = js.native
}

