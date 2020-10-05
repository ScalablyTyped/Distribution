package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.MemoVoidIteratorCapped
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTransform1x2[TResult] extends js.Object {
  def apply[T](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]]): LodashTransform1x3[T, TResult] = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], `object`: js.Array[T]): js.Array[TResult] = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], `object`: Dictionary[T]): js.Array[TResult] = js.native
  def apply[T](iteratee: __, `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T](iteratee: __, `object`: Dictionary[T]): LodashTransform4x6[T, TResult] = js.native
}

