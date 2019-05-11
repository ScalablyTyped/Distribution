package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLast extends js.Object {
  def apply[T](predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean]): LodashFindLast2x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ],
    collection: T
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean],
    collection: lodashLib.lodashMod.List[T]
  ): js.UndefOr[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__): LodashFindLast1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.__, collection: T): LodashFindLast3x2[T] = js.native
  def apply[T](predicate: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashFindLast1x2[T] = js.native
  def apply[T, S /* <: T */](predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S]): LodashFindLast1x1[T, S] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.ValueIteratorTypeGuard[T, S],
    collection: lodashLib.lodashMod.List[T]
  ): js.UndefOr[S] = js.native
}

