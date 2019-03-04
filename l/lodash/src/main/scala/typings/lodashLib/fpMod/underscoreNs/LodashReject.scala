package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReject extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    collection: T
  ): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.__): LodashReject2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.__, collection: T): LodashReject2x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.__,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashReject1x2[T] = js.native
}

