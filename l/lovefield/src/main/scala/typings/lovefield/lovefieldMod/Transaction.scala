package typings.lovefield.lovefieldMod

import typings.lovefield.lovefieldMod.query.Builder
import typings.lovefield.lovefieldMod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def attach(query: Builder): js.Promise[js.Array[js.Object]]
  def begin(scope: js.Array[Table]): js.Promise[Unit]
  def commit(): js.Promise[Unit]
  def exec(queries: js.Array[Builder]): js.Promise[js.Array[js.Array[js.Object]]]
  def rollback(): js.Promise[Unit]
  def stats(): TransactionStats
}

object Transaction {
  @scala.inline
  def apply(
    attach: Builder => js.Promise[js.Array[js.Object]],
    begin: js.Array[Table] => js.Promise[Unit],
    commit: () => js.Promise[Unit],
    exec: js.Array[Builder] => js.Promise[js.Array[js.Array[js.Object]]],
    rollback: () => js.Promise[Unit],
    stats: () => TransactionStats
  ): Transaction = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), begin = js.Any.fromFunction1(begin), commit = js.Any.fromFunction0(commit), exec = js.Any.fromFunction1(exec), rollback = js.Any.fromFunction0(rollback), stats = js.Any.fromFunction0(stats))
  
    __obj.asInstanceOf[Transaction]
  }
}

