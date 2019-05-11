package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSumBy extends js.Object {
  def apply[T](iteratee: java.lang.String): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: java.lang.String, collection: lodashLib.lodashMod.List[T]): scala.Double = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, scala.Double]): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, scala.Double], collection: lodashLib.lodashMod.List[T]): scala.Double = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__): LodashSumBy1x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashSumBy1x2[T] = js.native
}

