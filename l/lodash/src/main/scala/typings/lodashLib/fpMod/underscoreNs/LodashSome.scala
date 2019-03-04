package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSome extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean]): scala.Boolean = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    collection: T
  ): scala.Boolean = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): scala.Boolean = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.__): LodashSome2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.__, collection: T): LodashSome2x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.__,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashSome1x2[T] = js.native
}

