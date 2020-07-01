package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTimes extends LodashConvertible {
  def apply(iteratee: __, n: Double): LodashTimes1x2 = js.native
  def apply[TResult](iteratee: js.Function1[/* num */ Double, TResult]): LodashTimes1x1[TResult] = js.native
  def apply[TResult](iteratee: js.Function1[/* num */ Double, TResult], n: Double): js.Array[TResult] = js.native
}

