package typings.lovefield

import typings.lovefield.mod.Binder
import typings.lovefield.mod.Predicate
import typings.lovefield.mod.schema.Builder
import typings.lovefield.mod.schema.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object lf {
    
    @JSGlobal("lf")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("lf.ConstraintAction")
    @js.native
    object ConstraintAction extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.lovefield.mod.ConstraintAction & Double] = js.native
      
      /* 1 */ val CASCADE: typings.lovefield.mod.ConstraintAction.CASCADE & Double = js.native
      
      /* 0 */ val RESTRICT: typings.lovefield.mod.ConstraintAction.RESTRICT & Double = js.native
    }
    
    @JSGlobal("lf.ConstraintTiming")
    @js.native
    object ConstraintTiming extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.lovefield.mod.ConstraintTiming & Double] = js.native
      
      /* 1 */ val DEFERRABLE: typings.lovefield.mod.ConstraintTiming.DEFERRABLE & Double = js.native
      
      /* 0 */ val IMMEDIATE: typings.lovefield.mod.ConstraintTiming.IMMEDIATE & Double = js.native
    }
    
    @JSGlobal("lf.Order")
    @js.native
    object Order extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.lovefield.mod.Order & Double] = js.native
      
      /* 0 */ val ASC: typings.lovefield.mod.Order.ASC & Double = js.native
      
      /* 1 */ val DESC: typings.lovefield.mod.Order.DESC & Double = js.native
    }
    
    @JSGlobal("lf.TransactionType")
    @js.native
    object TransactionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.lovefield.mod.TransactionType & Double] = js.native
      
      /* 0 */ val READ_ONLY: typings.lovefield.mod.TransactionType.READ_ONLY & Double = js.native
      
      /* 1 */ val READ_WRITE: typings.lovefield.mod.TransactionType.READ_WRITE & Double = js.native
    }
    
    @JSGlobal("lf.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.lovefield.mod.Type & Double] = js.native
      
      /* 0 */ val ARRAY_BUFFER: typings.lovefield.mod.Type.ARRAY_BUFFER & Double = js.native
      
      /* 1 */ val BOOLEAN: typings.lovefield.mod.Type.BOOLEAN & Double = js.native
      
      /* 2 */ val DATE_TIME: typings.lovefield.mod.Type.DATE_TIME & Double = js.native
      
      /* 3 */ val INTEGER: typings.lovefield.mod.Type.INTEGER & Double = js.native
      
      /* 4 */ val NUMBER: typings.lovefield.mod.Type.NUMBER & Double = js.native
      
      /* 5 */ val OBJECT: typings.lovefield.mod.Type.OBJECT & Double = js.native
      
      /* 6 */ val STRING: typings.lovefield.mod.Type.STRING & Double = js.native
    }
    
    inline def bind(index: Double): Binder = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(index.asInstanceOf[js.Any]).asInstanceOf[Binder]
    
    // module op
    object fn {
      
      @JSGlobal("lf.fn")
      @js.native
      val ^ : js.Any = js.native
      
      inline def avg(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("avg")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
      
      inline def count(): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Column]
      inline def count(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
      
      inline def distinct(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
      
      inline def geomean(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("geomean")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
      
      inline def max(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
      
      inline def min(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
      
      inline def stddev(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("stddev")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
      
      inline def sum(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
    }
    
    // module schema
    object op {
      
      @JSGlobal("lf.op")
      @js.native
      val ^ : js.Any = js.native
      
      inline def and(args: Predicate*): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Predicate]
      
      inline def not(operand: Predicate): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(operand.asInstanceOf[js.Any]).asInstanceOf[Predicate]
      
      inline def or(args: Predicate*): Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Predicate]
    }
    
    // module raw
    object schema {
      
      @JSGlobal("lf.schema")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("lf.schema.DataStoreType")
      @js.native
      object DataStoreType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.lovefield.mod.schema.DataStoreType & Double] = js.native
        
        /* 3 */ val FIREBASE: typings.lovefield.mod.schema.DataStoreType.FIREBASE & Double = js.native
        
        /* 0 */ val INDEXED_DB: typings.lovefield.mod.schema.DataStoreType.INDEXED_DB & Double = js.native
        
        /* 2 */ val LOCAL_STORAGE: typings.lovefield.mod.schema.DataStoreType.LOCAL_STORAGE & Double = js.native
        
        /* 1 */ val MEMORY: typings.lovefield.mod.schema.DataStoreType.MEMORY & Double = js.native
        
        /* 4 */ val WEB_SQL: typings.lovefield.mod.schema.DataStoreType.WEB_SQL & Double = js.native
      }
      
      inline def create(dbName: String, dbVersion: Double): Builder = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(dbName.asInstanceOf[js.Any], dbVersion.asInstanceOf[js.Any])).asInstanceOf[Builder]
    }
  }
}
