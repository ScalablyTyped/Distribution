package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMap extends js.Object {
  def apply(iteratee: java.lang.String): js.Array[_] = js.native
  def apply(iteratee: java.lang.String, collection: js.Object): js.Array[_] = js.native
  def apply(iteratee: js.Object): js.Array[scala.Boolean] = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[scala.Boolean] = js.native
  def apply(iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashFlatMap3x2 = js.native
  def apply(iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: js.Object): LodashFlatMap3x2 = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashFlatMap2x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashFlatMap1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, lodashLib.lodashMod.underscoreNs.Many[TResult]]): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.underscoreNs.Many[TResult]
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, lodashLib.lodashMod.underscoreNs.Many[TResult]],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[TResult] = js.native
}

