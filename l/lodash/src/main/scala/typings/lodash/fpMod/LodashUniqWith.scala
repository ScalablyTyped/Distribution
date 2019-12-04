package typings.lodash.fpMod

import typings.lodash.lodashMod.Comparator
import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUniqWith extends js.Object {
  def apply[T](comparator: Comparator[T]): LodashUniqWith1x1[T] = js.native
  def apply[T](comparator: Comparator[T], array: List[T]): js.Array[T] = js.native
  def apply[T](comparator: __): LodashUniqWith1x2[T] = js.native
  def apply[T](comparator: __, array: List[T]): LodashUniqWith1x2[T] = js.native
}

