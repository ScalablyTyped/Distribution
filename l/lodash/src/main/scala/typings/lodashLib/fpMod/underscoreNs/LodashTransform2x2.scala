package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform2x2[TResult] extends js.Object {
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.MemoVoidIteratorCapped[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]]
  ): LodashTransform2x3[T, TResult] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.MemoVoidIteratorCapped[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]],
    `object`: js.Array[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[TResult] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.MemoVoidIteratorCapped[T, lodashLib.lodashMod.underscoreNs.Dictionary[TResult]],
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[TResult] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`, `object`: js.Array[T]): LodashTransform2x6[T, TResult] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): LodashTransform3x6[T, TResult] = js.native
}

