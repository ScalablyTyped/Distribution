package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForEachRight extends js.Object {
  def apply(iteratee: js.Function1[/* value */ java.lang.String, _]): LodashForEachRight2x1 = js.native
  def apply(iteratee: js.Function1[/* value */ java.lang.String, _], collection: java.lang.String): java.lang.String = js.native
  def apply(iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: java.lang.String): LodashForEachRight2x2 = js.native
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List())))) *//* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | scala.Null] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: lodashLib.lodashMod.underscoreNs.List[T]): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashForEachRight8x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashForEachRight8x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: js.Array[T]): LodashForEachRight1x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashForEachRight3x2[T] = js.native
}

