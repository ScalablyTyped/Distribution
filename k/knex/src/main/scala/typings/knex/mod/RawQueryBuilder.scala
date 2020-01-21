package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawQueryBuilder[TRecord, TResult] extends js.Object {
  def apply[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TResult2](sql: String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TResult2](sql: String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TResult2](sql: String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
}

