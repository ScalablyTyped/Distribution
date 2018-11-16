package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllBy3x2[T2] extends js.Object {
  def apply[T1](iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2]): LodashPullAllBy3x3[T1] = js.native
  def apply[T1](iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2], array: js.Array[T1]): js.Array[T1] = js.native
  def apply[T1](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T1 | T2],
    array: lodashLib.lodashMod.underscoreNs.List[T1]
  ): lodashLib.lodashMod.underscoreNs.List[T1] = js.native
  def apply[T1](iteratee: lodashLib.lodashMod.underscoreNs.`__`, array: js.Array[T1]): LodashPullAllBy3x6[T1, T2] = js.native
  def apply[T1](iteratee: lodashLib.lodashMod.underscoreNs.`__`, array: lodashLib.lodashMod.underscoreNs.List[T1]): LodashPullAllBy4x6[T1, T2] = js.native
}

