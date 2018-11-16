package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction
  extends knexLib.knexMod.Knex {
  def commit(): QueryBuilder = js.native
  def commit(value: js.Any): QueryBuilder = js.native
  def rollback(): QueryBuilder = js.native
  def rollback(error: js.Any): QueryBuilder = js.native
  def savepoint(transactionScope: js.Function1[/* trx */ this.type, _]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

