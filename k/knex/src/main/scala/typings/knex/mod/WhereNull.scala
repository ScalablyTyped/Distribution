package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereNull[TRecord, TResult] extends js.Object {
  def apply(columnName: /* keyof TRecord */ String): QueryBuilder[TRecord, TResult] = js.native
}

