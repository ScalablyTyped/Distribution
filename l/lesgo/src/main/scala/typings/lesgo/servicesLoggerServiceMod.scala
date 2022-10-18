package typings.lesgo

import typings.lesgo.anon.Extra
import typings.lesgo.anon.GetCreatedAt
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesLoggerServiceMod {
  
  @JSImport("lesgo/services/LoggerService", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LoggerService {
    def this(opts: LoggerServiceParams) = this()
  }
  /* static members */
  object default {
    
    @JSImport("lesgo/services/LoggerService", "default.logLevels")
    @js.native
    val logLevels: LogLevels = js.native
  }
  
  @js.native
  sealed trait LogLevels extends StObject
  @JSImport("lesgo/services/LoggerService", "LogLevels")
  @js.native
  object LogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevels & Double] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with LogLevels
    /* 3 */ val debug: typings.lesgo.servicesLoggerServiceMod.LogLevels.debug & Double = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with LogLevels
    /* 0 */ val error: typings.lesgo.servicesLoggerServiceMod.LogLevels.error & Double = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with LogLevels
    /* 2 */ val info: typings.lesgo.servicesLoggerServiceMod.LogLevels.info & Double = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with LogLevels
    /* 1 */ val warn: typings.lesgo.servicesLoggerServiceMod.LogLevels.warn & Double = js.native
  }
  
  trait LoggerMessage extends StObject {
    
    var extra: js.UndefOr[LoggerMeta] = js.undefined
    
    var level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String
    
    var logger: String
    
    var message: String
  }
  object LoggerMessage {
    
    inline def apply(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String,
      logger: String,
      message: String
    ): LoggerMessage = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerMessage]
    }
    
    extension [Self <: LoggerMessage](x: Self) {
      
      inline def setExtra(value: LoggerMeta): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setLevel(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type LoggerMeta = Record[String, Any]
  
  @js.native
  trait LoggerService extends StObject {
    
    def addMeta(): Unit = js.native
    def addMeta(meta: LoggerMeta): Unit = js.native
    
    /* protected */ def checkIsLogRequired(
      transportName: String,
      leve: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String
    ): Boolean = js.native
    
    def consoleLogger(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String,
      message: RedefinedMessage
    ): Unit = js.native
    
    def debug(message: String): Unit = js.native
    def debug(message: String, extra: LoggerMeta): Unit = js.native
    
    def error(message: String): Unit = js.native
    def error(message: String, extra: LoggerMeta): Unit = js.native
    
    /* protected */ var getCreatedAt: Boolean = js.native
    
    /* protected */ def getTransportByName(transportName: String): LoggerTransport = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, extra: LoggerMeta): Unit = js.native
    
    def log(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String,
      message: String
    ): Unit = js.native
    def log(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String,
      message: String,
      extra: LoggerMeta
    ): Unit = js.native
    
    /* protected */ var logger: String = js.native
    
    /* protected */ var meta: LoggerMeta = js.native
    
    /* protected */ def refineMessagePerTransport(transportName: String, message: RedefinedMessage): RedefinedMessage = js.native
    
    /* protected */ def structureLogMessage(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String,
      message: String,
      extra: LoggerMeta
    ): LoggerMessage = js.native
    
    /* protected */ var transports: js.Array[LoggerTransport] = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, extra: LoggerMeta): Unit = js.native
  }
  
  trait LoggerServiceParams extends StObject {
    
    var defaultMeta: LoggerMeta
    
    var logger: js.UndefOr[String] = js.undefined
    
    var transports: js.Array[LoggerTransport]
  }
  object LoggerServiceParams {
    
    inline def apply(defaultMeta: LoggerMeta, transports: js.Array[LoggerTransport]): LoggerServiceParams = {
      val __obj = js.Dynamic.literal(defaultMeta = defaultMeta.asInstanceOf[js.Any], transports = transports.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerServiceParams]
    }
    
    extension [Self <: LoggerServiceParams](x: Self) {
      
      inline def setDefaultMeta(value: LoggerMeta): Self = StObject.set(x, "defaultMeta", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setTransports(value: js.Array[LoggerTransport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsVarargs(value: LoggerTransport*): Self = StObject.set(x, "transports", js.Array(value*))
    }
  }
  
  trait LoggerTransport extends StObject {
    
    var config: js.UndefOr[GetCreatedAt] = js.undefined
    
    var level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String
    
    var logType: String
  }
  object LoggerTransport {
    
    inline def apply(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String,
      logType: String
    ): LoggerTransport = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerTransport]
    }
    
    extension [Self <: LoggerTransport](x: Self) {
      
      inline def setConfig(value: GetCreatedAt): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setLevel(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevels * / any */ String
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    }
  }
  
  type RedefinedMessage = (Record[String, Any]) & Extra
  
  trait Tag extends StObject {
    
    var env: String
    
    var service: String
  }
  object Tag {
    
    inline def apply(env: String, service: String): Tag = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
