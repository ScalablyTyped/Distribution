package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashZipWith1x2[T1] extends js.Object {
  def apply[T2](iteratee: lodashLib.lodashMod.__, arrays2: lodashLib.lodashMod.List[T2]): LodashZipWith1x6[T1, T2] = js.native
  def apply[T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]): LodashZipWith1x3[T2, TResult] = js.native
  def apply[T2, TResult](
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult],
    arrays2: lodashLib.lodashMod.List[T2]
  ): js.Array[TResult] = js.native
}

