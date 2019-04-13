package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def attach(query: lovefieldLib.lovefieldMod.queryNs.Builder): js.Promise[js.Array[js.Object]]
  def begin(scope: js.Array[lovefieldLib.lovefieldMod.schemaNs.Table]): js.Promise[scala.Unit]
  def commit(): js.Promise[scala.Unit]
  def exec(queries: js.Array[lovefieldLib.lovefieldMod.queryNs.Builder]): js.Promise[js.Array[js.Array[js.Object]]]
  def rollback(): js.Promise[scala.Unit]
  def stats(): TransactionStats
}

object Transaction {
  @scala.inline
  def apply(
    attach: lovefieldLib.lovefieldMod.queryNs.Builder => js.Promise[js.Array[js.Object]],
    begin: js.Array[lovefieldLib.lovefieldMod.schemaNs.Table] => js.Promise[scala.Unit],
    commit: () => js.Promise[scala.Unit],
    exec: js.Array[lovefieldLib.lovefieldMod.queryNs.Builder] => js.Promise[js.Array[js.Array[js.Object]]],
    rollback: () => js.Promise[scala.Unit],
    stats: () => TransactionStats
  ): Transaction = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), begin = js.Any.fromFunction1(begin), commit = js.Any.fromFunction0(commit), exec = js.Any.fromFunction1(exec), rollback = js.Any.fromFunction0(rollback), stats = js.Any.fromFunction0(stats))
  
    __obj.asInstanceOf[Transaction]
  }
}

