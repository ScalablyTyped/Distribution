package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindFrom1x2 extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean]): LodashFindFrom2x3[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    collection: T
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIterateeCustom[T, scala.Boolean],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.UndefOr[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.underscoreNs.`__`): LodashFindFrom1x6[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashFindFrom3x6[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashFindFrom1x6[T] = js.native
  def apply[T, S /* <: T */](predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[T, S],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.UndefOr[S] = js.native
}

