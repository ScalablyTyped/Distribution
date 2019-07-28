package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRaw[TRecord, TResult] extends js.Object {
  def apply(alias: String, raw: QueryBuilder[_, js.Array[SafePartial[_]]]): QueryBuilder[TRecord, TResult] = js.native
  def apply(alias: String, raw: Raw[_]): QueryBuilder[TRecord, TResult] = js.native
  def apply(alias: String, sql: String): QueryBuilder[TRecord, TResult] = js.native
  def apply(alias: String, sql: String, bindings: js.Array[Value]): QueryBuilder[TRecord, TResult] = js.native
  def apply(alias: String, sql: String, bindings: js.Object): QueryBuilder[TRecord, TResult] = js.native
}

