package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform1x2[TResult] extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]]): LodashTransform1x3[T, TResult] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]], `object`: js.Array[T]): js.Array[TResult] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]],
    `object`: lodashLib.lodashMod.Dictionary[T]
  ): js.Array[TResult] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.Dictionary[T]): LodashTransform4x6[T, TResult] = js.native
}

