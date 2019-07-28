package typings.lodash.fpMod

import typings.lodash.lodashMod.Comparator2
import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDifferenceWith1x2[T1] extends js.Object {
  def apply[T2](comparator: Comparator2[T1, T2]): LodashDifferenceWith1x3[T1, T2] = js.native
  def apply[T2](comparator: Comparator2[T1, T2], values: List[T2]): js.Array[T1] = js.native
  def apply[T2](comparator: __, values: List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
}

