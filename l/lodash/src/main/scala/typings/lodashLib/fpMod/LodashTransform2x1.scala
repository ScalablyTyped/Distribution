package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform2x1[T, TResult] extends js.Object {
  def apply(accumulator: lodashLib.lodashMod.Dictionary[TResult]): LodashTransform2x3[T, TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.Dictionary[TResult], `object`: js.Array[T]): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.Dictionary[TResult], `object`: lodashLib.lodashMod.Dictionary[T]): lodashLib.lodashMod.Dictionary[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.__, `object`: js.Array[T]): LodashTransform2x5[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.Dictionary[T]): LodashTransform3x5[TResult] = js.native
}

