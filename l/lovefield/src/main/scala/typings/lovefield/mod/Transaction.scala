package typings.lovefield.mod

import typings.lovefield.mod.query.Builder
import typings.lovefield.mod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  def attach(query: Builder): js.Promise[js.Array[js.Object]] = js.native
  
  def begin(scope: js.Array[Table]): js.Promise[Unit] = js.native
  
  def commit(): js.Promise[Unit] = js.native
  
  def exec(queries: js.Array[Builder]): js.Promise[js.Array[js.Array[js.Object]]] = js.native
  
  def rollback(): js.Promise[Unit] = js.native
  
  def stats(): TransactionStats = js.native
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
  
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttach(value: Builder => js.Promise[js.Array[js.Object]]): Self = this.set("attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBegin(value: js.Array[Table] => js.Promise[Unit]): Self = this.set("begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommit(value: () => js.Promise[Unit]): Self = this.set("commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExec(value: js.Array[Builder] => js.Promise[js.Array[js.Array[js.Object]]]): Self = this.set("exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRollback(value: () => js.Promise[Unit]): Self = this.set("rollback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStats(value: () => TransactionStats): Self = this.set("stats", js.Any.fromFunction0(value))
  }
}
