package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGroupBy extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T]): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def apply[T /* <: js.Object */](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any],
    collection: T
  ): lodashLib.lodashMod.underscoreNs.Dictionary[
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.ValueIteratee[T],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): lodashLib.lodashMod.underscoreNs.Dictionary[js.Array[T]] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashGroupBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashGroupBy2x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashGroupBy1x2[T] = js.native
}

