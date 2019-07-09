package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction[TRecord /* <: js.Object */, TResult] extends Knex[TRecord, TResult] {
  var executionPromise: js.Promise[TResult] = js.native
  def commit(): QueryBuilder[TRecord, TResult] = js.native
  def commit(value: js.Any): QueryBuilder[TRecord, TResult] = js.native
  def query[TRecord /* <: js.Object */, TResult](conn: js.Any, sql: js.Any, status: js.Any, value: js.Any): QueryBuilder[TRecord, TResult] = js.native
  def rollback(): QueryBuilder[TRecord, TResult] = js.native
  def rollback(error: js.Any): QueryBuilder[TRecord, TResult] = js.native
  def savepoint[T](transactionScope: js.Function1[/* trx */ Transaction[_, _], _]): js.Promise[T] = js.native
}

