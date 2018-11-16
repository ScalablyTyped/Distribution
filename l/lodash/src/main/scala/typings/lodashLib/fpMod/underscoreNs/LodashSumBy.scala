package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSumBy extends js.Object {
  def apply[T](iteratee: java.lang.String): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: java.lang.String, collection: lodashLib.lodashMod.underscoreNs.List[T]): scala.Double = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, scala.Double]): LodashSumBy1x1[T] = js.native
  def apply[T](
    iteratee: js.Function1[/* value */ T, scala.Double],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): scala.Double = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashSumBy1x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashSumBy1x2[T] = js.native
}

