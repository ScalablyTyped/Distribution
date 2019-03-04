package typings
package lovefieldLib.lovefieldMod.lfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def attach(query: lovefieldLib.lovefieldMod.lfNs.queryNs.Builder): js.Promise[js.Array[js.Object]]
  def begin(scope: js.Array[lovefieldLib.lovefieldMod.lfNs.schemaNs.Table]): js.Promise[scala.Unit]
  def commit(): js.Promise[scala.Unit]
  def exec(queries: js.Array[lovefieldLib.lovefieldMod.lfNs.queryNs.Builder]): js.Promise[js.Array[js.Array[js.Object]]]
  def rollback(): js.Promise[scala.Unit]
  def stats(): TransactionStats
}

object Transaction {
  @scala.inline
  def apply(
    attach: js.Function1[lovefieldLib.lovefieldMod.lfNs.queryNs.Builder, js.Promise[js.Array[js.Object]]],
    begin: js.Function1[js.Array[lovefieldLib.lovefieldMod.lfNs.schemaNs.Table], js.Promise[scala.Unit]],
    commit: js.Function0[js.Promise[scala.Unit]],
    exec: js.Function1[
      js.Array[lovefieldLib.lovefieldMod.lfNs.queryNs.Builder], 
      js.Promise[js.Array[js.Array[js.Object]]]
    ],
    rollback: js.Function0[js.Promise[scala.Unit]],
    stats: js.Function0[TransactionStats]
  ): Transaction = {
    val __obj = js.Dynamic.literal(attach = attach, begin = begin, commit = commit, exec = exec, rollback = rollback, stats = stats)
  
    __obj.asInstanceOf[Transaction]
  }
}

