package typings.knex.mod

import typings.knex.AnonColumn
import typings.knex.AnonOrder
import typings.knex.knexStrings.asc
import typings.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[TRecord, TResult] extends js.Object {
  def apply(columnDefs: js.Array[AnonColumn[TRecord] | AnonOrder | String]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: asc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: desc): QueryBuilder[TRecord, TResult] = js.native
  def apply[TRecordInner, TResultInner](subQueryBuilder: QueryBuilder[TRecordInner, TResultInner]): QueryBuilder[TRecord, TResult] = js.native
}

