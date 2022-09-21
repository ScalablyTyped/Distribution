package typings.ionicCliFrameworkOutput

import typings.ionicCliFrameworkOutput.loggerMod.LogRecord
import typings.ionicCliFrameworkOutput.loggerMod.LoggerFormatter
import typings.ionicCliFrameworkOutput.loggerMod.LoggerHandler
import typings.ionicCliFrameworkOutput.loggerMod.LoggerLevelWeight
import typings.std.Set
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@ionic/cli-framework-output.@ionic/cli-framework-output/dist/logger.LoggerOptions> */
  trait PartialLoggerOptions extends StObject {
    
    var handlers: js.UndefOr[Set[LoggerHandler]] = js.undefined
    
    var level: js.UndefOr[LoggerLevelWeight] = js.undefined
  }
  object PartialLoggerOptions {
    
    inline def apply(): PartialLoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLoggerOptions]
    }
    
    extension [Self <: PartialLoggerOptions](x: Self) {
      
      inline def setHandlers(value: Set[LoggerHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setLevel(value: LoggerLevelWeight): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ionic/cli-framework-output.@ionic/cli-framework-output/dist/logger.StreamHandlerOptions> */
  trait PartialStreamHandlerOptio extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.undefined
    
    var formatter: js.UndefOr[LoggerFormatter] = js.undefined
    
    var stream: js.UndefOr[WritableStream[Any]] = js.undefined
  }
  object PartialStreamHandlerOptio {
    
    inline def apply(): PartialStreamHandlerOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStreamHandlerOptio]
    }
    
    extension [Self <: PartialStreamHandlerOptio](x: Self) {
      
      inline def setFilter(value: /* record */ LogRecord => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFormatter(value: /* record */ LogRecord => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setStream(value: WritableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ionic/cli-framework-output.@ionic/cli-framework-output/dist/tasks.TaskOptions> */
  trait PartialTaskOptions extends StObject {
    
    var msg: js.UndefOr[String] = js.undefined
    
    var tickInterval: js.UndefOr[Double] = js.undefined
  }
  object PartialTaskOptions {
    
    inline def apply(): PartialTaskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTaskOptions]
    }
    
    extension [Self <: PartialTaskOptions](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
      
      inline def setTickIntervalUndefined: Self = StObject.set(x, "tickInterval", js.undefined)
    }
  }
}
