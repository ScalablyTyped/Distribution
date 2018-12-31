package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFilter extends js.Object {
  def apply(predicate: js.Function1[/* value */ java.lang.String, scala.Boolean]): js.Array[java.lang.String] = js.native
  def apply(predicate: js.Function1[/* value */ java.lang.String, scala.Boolean], collection: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(predicate: lodashLib.lodashMod.underscoreNs.`__`): LodashFilter1x2 = js.native
  def apply(predicate: lodashLib.lodashMod.underscoreNs.`__`, collection: java.lang.String): LodashFilter1x2 = js.native
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
  def apply[T /* <: js.Object */](predicate: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashFilter4x2[T] = js.native
  def apply[T](
    predicate: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashFilter2x2[T] = js.native
  def apply[T /* <: js.Object */, S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.Array[S] = js.native
  def apply[T, S /* <: T */](
    predicate: lodashLib.lodashMod.underscoreNs.ValueIteratorTypeGuard[T, S],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[S] = js.native
}

