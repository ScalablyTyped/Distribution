package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereRaw[TRecord, TResult] extends RawQueryBuilder[TRecord, TResult] {
  def apply(condition: Boolean): QueryBuilder[TRecord, TResult] = js.native
}

