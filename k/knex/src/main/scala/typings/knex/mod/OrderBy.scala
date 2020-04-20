package typings.knex.mod

import typings.knex.AnonColumn
import typings.knex.ReadonlycolumnstringQuery
import typings.knex.knexStrings.asc
import typings.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[TRecord, TResult] extends js.Object {
  def apply(
    columnDefs: js.Array[AnonColumn[TRecord] | ReadonlycolumnstringQuery | (/* keyof TRecord */ String)]
  ): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: /* keyof TRecord */ String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: /* keyof TRecord */ String, order: asc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: /* keyof TRecord */ String, order: desc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: QueryBuilder[_, _]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: QueryBuilder[_, _], order: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: QueryBuilder[_, _], order: asc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: QueryBuilder[_, _], order: desc): QueryBuilder[TRecord, TResult] = js.native
}

