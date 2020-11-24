package typings.lodash.fpMod

import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.lodash.mod.Many
import typings.lodash.mod.NotVoid
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy1x4[T] extends js.Object {
  
  def apply(iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x5[T] = js.native
  def apply(
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T] = js.native
}
