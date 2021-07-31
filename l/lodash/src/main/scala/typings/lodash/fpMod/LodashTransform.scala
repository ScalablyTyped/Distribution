package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.MemoVoidIteratorCapped
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform extends StObject {
  
  def apply[TResult](iteratee: __, accumulator: TResult): LodashTransform1x2[TResult] = js.native
  def apply[T](iteratee: __, accumulator: __, `object`: js.Array[T]): LodashTransform1x4[T] = js.native
  def apply[T](iteratee: __, accumulator: __, `object`: Dictionary[T]): LodashTransform2x4[T] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult]): LodashTransform1x1[T, TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult): LodashTransform1x3[T, TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: js.Array[T]): TResult = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: Dictionary[T]): TResult = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def apply[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: Dictionary[T]): LodashTransform2x5[TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: TResult, `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T, TResult](iteratee: __, accumulator: TResult, `object`: Dictionary[T]): LodashTransform2x6[T, TResult] = js.native
}
