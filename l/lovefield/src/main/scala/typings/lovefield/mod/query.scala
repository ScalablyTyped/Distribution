package typings.lovefield.mod

import typings.lovefield.mod.schema.Column
import typings.lovefield.mod.schema.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object query {
  
  @js.native
  trait Builder extends StObject {
    
    def bind(values: js.Any*): Builder = js.native
    
    def exec(): js.Promise[js.Array[js.Object]] = js.native
    
    def explain(): String = js.native
    
    def toSql(): String = js.native
  }
  object Builder {
    
    @scala.inline
    def apply(
      bind: /* repeated */ js.Any => Builder,
      exec: () => js.Promise[js.Array[js.Object]],
      explain: () => String,
      toSql: () => String
    ): Builder = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), toSql = js.Any.fromFunction0(toSql))
      __obj.asInstanceOf[Builder]
    }
    
    @scala.inline
    implicit class BuilderMutableBuilder[Self <: Builder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: /* repeated */ js.Any => Builder): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExec(value: () => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "exec", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExplain(value: () => String): Self = StObject.set(x, "explain", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSql(value: () => String): Self = StObject.set(x, "toSql", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Delete extends Builder {
    
    def from(table: Table): Delete = js.native
    
    def where(predicate: Predicate): Delete = js.native
  }
  object Delete {
    
    @scala.inline
    def apply(
      bind: /* repeated */ js.Any => Builder,
      exec: () => js.Promise[js.Array[js.Object]],
      explain: () => String,
      from: Table => Delete,
      toSql: () => String,
      where: Predicate => Delete
    ): Delete = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), from = js.Any.fromFunction1(from), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Table => Delete): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhere(value: Predicate => Delete): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Insert extends Builder {
    
    def into(table: Table): Insert = js.native
    
    def values(rows: js.Array[Binder | Row]): Insert = js.native
    def values(rows: Binder): Insert = js.native
  }
  
  @js.native
  trait Select extends Builder {
    
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
  
  @js.native
  trait Update extends Builder {
    
    def set(column: Column, value: js.Any): Update = js.native
    
    def where(predicate: Predicate): Update = js.native
  }
  object Update {
    
    @scala.inline
    def apply(
      bind: /* repeated */ js.Any => Builder,
      exec: () => js.Promise[js.Array[js.Object]],
      explain: () => String,
      set: (Column, js.Any) => Update,
      toSql: () => String,
      where: Predicate => Update
    ): Update = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), set = js.Any.fromFunction2(set), toSql = js.Any.fromFunction0(toSql), where = js.Any.fromFunction1(where))
      __obj.asInstanceOf[Update]
    }
    
    @scala.inline
    implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSet(value: (Column, js.Any) => Update): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWhere(value: Predicate => Update): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
    }
  }
}
