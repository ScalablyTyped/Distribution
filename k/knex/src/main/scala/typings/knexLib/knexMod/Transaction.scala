package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction[T]
  extends Knex[js.Any, T] {
  def commit(): QueryBuilder[_, T] = js.native
  def commit(value: js.Any): QueryBuilder[_, T] = js.native
  def rollback(): QueryBuilder[_, T] = js.native
  def rollback(error: js.Any): QueryBuilder[_, T] = js.native
  def savepoint(transactionScope: js.Function1[/* trx */ Transaction[T], _]): bluebirdLib.bluebirdMod.^[T] = js.native
}

