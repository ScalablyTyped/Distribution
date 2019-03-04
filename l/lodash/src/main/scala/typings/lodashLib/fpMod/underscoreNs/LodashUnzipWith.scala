package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnzipWith extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.__): LodashUnzipWith1x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.__,
    array: lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]]
  ): LodashUnzipWith1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* repeated */ T, TResult],
    array: lodashLib.lodashMod.underscoreNs.List[lodashLib.lodashMod.underscoreNs.List[T]]
  ): js.Array[TResult] = js.native
}

