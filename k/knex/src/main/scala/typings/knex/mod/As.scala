package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As[TRecord, TResult] extends js.Object {
  def apply(columnName: String): QueryBuilder[TRecord, TResult] = js.native
}

