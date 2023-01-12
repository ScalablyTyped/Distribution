package typings.lovefield.mod

import typings.lovefield.mod.query.Builder
import typings.lovefield.mod.schema.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  def attach(query: Builder): js.Promise[js.Array[js.Object]]
  
  def begin(scope: js.Array[Table]): js.Promise[Unit]
  
  def commit(): js.Promise[Unit]
  
  def exec(queries: js.Array[Builder]): js.Promise[js.Array[js.Array[js.Object]]]
  
  def rollback(): js.Promise[Unit]
  
  def stats(): TransactionStats
}
object Transaction {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    inline def setAttach(value: Builder => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    inline def setBegin(value: js.Array[Table] => js.Promise[Unit]): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    inline def setCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setExec(value: js.Array[Builder] => js.Promise[js.Array[js.Array[js.Object]]]): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    inline def setRollback(value: () => js.Promise[Unit]): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
    
    inline def setStats(value: () => TransactionStats): Self = StObject.set(x, "stats", js.Any.fromFunction0(value))
  }
}
