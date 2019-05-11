package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnzipWith extends js.Object {
  def apply[T](iteratee: lodashLib.lodashMod.__): LodashUnzipWith1x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, array: lodashLib.lodashMod.List[lodashLib.lodashMod.List[T]]): LodashUnzipWith1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* repeated */ T, TResult],
    array: lodashLib.lodashMod.List[lodashLib.lodashMod.List[T]]
  ): js.Array[TResult] = js.native
}

