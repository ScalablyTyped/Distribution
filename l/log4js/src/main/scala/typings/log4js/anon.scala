package typings.log4js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Appenders extends StObject {
    
    var appenders: js.Array[String]
    
    var enableCallStack: js.UndefOr[Boolean] = js.undefined
    
    var level: String
  }
  object Appenders {
    
    @scala.inline
    def apply(appenders: js.Array[String], level: String): Appenders = {
      val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Appenders]
    }
    
    @scala.inline
    implicit class AppendersMutableBuilder[Self <: Appenders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppenders(value: js.Array[String]): Self = StObject.set(x, "appenders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendersVarargs(value: String*): Self = StObject.set(x, "appenders", js.Array(value :_*))
      
      @scala.inline
      def setEnableCallStack(value: Boolean): Self = StObject.set(x, "enableCallStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCallStackUndefined: Self = StObject.set(x, "enableCallStack", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    var context: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[typings.log4js.mod.Format] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var nolog: js.UndefOr[js.Any] = js.undefined
    
    var statusRules: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object Context {
    
    @scala.inline
    def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Boolean): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFormat(value: typings.log4js.mod.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction3(
        value: (/* req */ js.Any, /* res */ js.Any, /* formatter */ js.Function1[/* str */ String, String]) => String
      ): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setNolog(value: js.Any): Self = StObject.set(x, "nolog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNologUndefined: Self = StObject.set(x, "nolog", js.undefined)
      
      @scala.inline
      def setStatusRules(value: js.Array[js.Any]): Self = StObject.set(x, "statusRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusRulesUndefined: Self = StObject.set(x, "statusRules", js.undefined)
      
      @scala.inline
      def setStatusRulesVarargs(value: js.Any*): Self = StObject.set(x, "statusRules", js.Array(value :_*))
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[typings.log4js.mod.Format] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var nolog: js.UndefOr[js.Any] = js.undefined
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: typings.log4js.mod.Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction3(
        value: (/* req */ js.Any, /* res */ js.Any, /* formatter */ js.Function1[/* str */ String, String]) => String
      ): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setNolog(value: js.Any): Self = StObject.set(x, "nolog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNologUndefined: Self = StObject.set(x, "nolog", js.undefined)
    }
  }
  
  trait Worker extends StObject {
    
    var worker: Double
    
    var workerId: Double
  }
  object Worker {
    
    @scala.inline
    def apply(worker: Double, workerId: Double): Worker = {
      val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Worker]
    }
    
    @scala.inline
    implicit class WorkerMutableBuilder[Self <: Worker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorker(value: Double): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerId(value: Double): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    }
  }
}
