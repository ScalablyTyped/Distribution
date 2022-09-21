package typings.koaLog4

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaLog4.koaLog4Strings.auto
import typings.log4js.anon.Context
import typings.log4js.mod.Configuration
import typings.log4js.mod.Level
import typings.log4js.mod.Levels_
import typings.log4js.mod.Log4js
import typings.log4js.mod.Logger
import typings.log4js.mod.LoggingEvent
import typings.log4js.mod.Recording_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-log4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLayout(name: String, config: js.Function1[/* a */ Any, js.Function1[/* logEvent */ LoggingEvent, Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLayout")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def configure(config: Configuration): Log4js = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Log4js]
  inline def configure(filename: String): Log4js = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(filename.asInstanceOf[js.Any]).asInstanceOf[Log4js]
  
  inline def connectLogger(logger: Logger, options: Context): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connectLogger")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
  inline def getLogger(category: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(category.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  inline def koaLogger(logger4js: Logger): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("koaLogger")(logger4js.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def koaLogger(logger4js: Logger, optionsOrFormat: String): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("koaLogger")(logger4js.asInstanceOf[js.Any], optionsOrFormat.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def koaLogger(logger4js: Logger, optionsOrFormat: Options): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("koaLogger")(logger4js.asInstanceOf[js.Any], optionsOrFormat.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-log4", "levels")
  @js.native
  val levels: Levels_ = js.native
  
  inline def recording(): Recording_ = ^.asInstanceOf[js.Dynamic].applyDynamic("recording")().asInstanceOf[Recording_]
  
  inline def shutdown(): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Unit | Null]
  inline def shutdown(cb: js.Function1[/* error */ js.Error, Unit]): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit | Null]
  
  trait Options extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[Level | auto] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLevel(value: Level | auto): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
