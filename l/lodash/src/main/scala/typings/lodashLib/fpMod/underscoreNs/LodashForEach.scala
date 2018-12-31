package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForEach extends js.Object {
  def apply(iteratee: js.Function1[/* value */ java.lang.String, _]): LodashForEach2x1 = js.native
  def apply(iteratee: js.Function1[/* value */ java.lang.String, _], collection: java.lang.String): java.lang.String = js.native
  def apply(iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: java.lang.String): LodashForEach2x2 = js.native
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | scala.Null] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: lodashLib.lodashMod.underscoreNs.List[T]): lodashLib.lodashMod.underscoreNs.List[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashForEach8x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashForEach8x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: js.Array[T]): LodashForEach1x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashForEach3x2[T] = js.native
}

