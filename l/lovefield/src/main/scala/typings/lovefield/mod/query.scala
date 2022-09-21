package typings.lovefield.mod

import typings.lovefield.mod.schema.Column
import typings.lovefield.mod.schema.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object query {
  
  trait Builder extends StObject {
    
    def bind(values: Any*): Builder
    
    def exec(): js.Promise[js.Array[js.Object]]
    
    def explain(): String
    
    def toSql(): String
  }
  object Builder {
    
    inline def apply(
      bind: /* repeated */ Any => Builder,
      exec: () => js.Promise[js.Array[js.Object]],
      explain: () => String,
      toSql: () => String
    ): Builder = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), toSql = js.Any.fromFunction0(toSql))
      __obj.asInstanceOf[Builder]
    }
    
    extension [Self <: Builder](x: Self) {
      
      inline def setBind(value: /* repeated */ Any => Builder): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      inline def setExec(value: () => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "exec", js.Any.fromFunction0(value))
      
      inline def setExplain(value: () => String): Self = StObject.set(x, "explain", js.Any.fromFunction0(value))
      
      inline def setToSql(value: () => String): Self = StObject.set(x, "toSql", js.Any.fromFunction0(value))
    }
  }
  
  trait Delete
    extends StObject
       with Builder {
    
    def from(table: Table): Delete
    
    def where(predicate: Predicate): Delete
  }
  object Delete {
    
    inline def apply(
      bind: /* repeated */ Any => Builder,
      exec: () => js.Promise[js.Array[js.Object]],
      explain: () => String,
      from: Table => Delete,
      toSql: () => String,
      where: Predicate => Delete
    ): Delete = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), from = js.Any.fromFunction1(from), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setFrom(value: Table => Delete): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      inline def setWhere(value: Predicate => Delete): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Insert
    extends StObject
       with Builder {
    
    def into(table: Table): Insert = js.native
    
    def values(rows: js.Array[Binder | Row]): Insert = js.native
    def values(rows: Binder): Insert = js.native
  }
  
  @js.native
  trait Select
    extends StObject
       with Builder {
    
    def from(tables: Table*): Select = js.native
    
    def groupBy(columns: Column*): Select = js.native
    
    def innerJoin(table: Table, predicate: Predicate): Select = js.native
    
    def leftOuterJoin(table: Table, predicate: Predicate): Select = js.native
    
    def limit(numberOfRows: Double): Select = js.native
    def limit(numberOfRows: Binder): Select = js.native
    
    def orderBy(column: Column): Select = js.native
    def orderBy(column: Column, order: Order): Select = js.native
    
    def skip(numberOfRows: Double): Select = js.native
    def skip(numberOfRows: Binder): Select = js.native
    
    def where(predicate: Predicate): Select = js.native
  }
  
  trait Update
    extends StObject
       with Builder {
    
    def set(column: Column, value: Any): Update
    
    def where(predicate: Predicate): Update
  }
  object Update {
    
    inline def apply(
      bind: /* repeated */ Any => Builder,
      exec: () => js.Promise[js.Array[js.Object]],
      explain: () => String,
      set: (Column, Any) => Update,
      toSql: () => String,
      where: Predicate => Update
    ): Update = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), set = js.Any.fromFunction2(set), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setSet(value: (Column, Any) => Update): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setWhere(value: Predicate => Update): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
    }
  }
}
