package typings.lodash.fpMod

import typings.lodash.lodashMod.Many
import typings.lodash.lodashMod.NotVoid
import typings.lodash.lodashMod.ValueIteratee
import typings.lodash.lodashMod.__
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x4[T] extends js.Object {
  def apply(iteratees: Many[js.Function1[/* value */ T, NotVoid]]): LodashOrderBy1x5[T] = js.native
  def apply(
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T] = js.native
}

