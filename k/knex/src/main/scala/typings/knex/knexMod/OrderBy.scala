package typings.knex.knexMod

import typings.knex.Anon_Asc
import typings.knex.Anon_Column
import typings.knex.knexStrings.asc
import typings.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderBy[TRecord, TResult] extends js.Object {
  def apply(columnDefs: js.Array[Anon_Asc[TRecord] | Anon_Column | String]): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: asc): QueryBuilder[TRecord, TResult] = js.native
  def apply(columnName: String, order: desc): QueryBuilder[TRecord, TResult] = js.native
}

