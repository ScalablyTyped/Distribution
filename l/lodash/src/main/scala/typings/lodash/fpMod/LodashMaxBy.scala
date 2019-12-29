package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.ValueIteratee
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMaxBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: __): LodashMaxBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMaxBy1x2[T] = js.native
}

