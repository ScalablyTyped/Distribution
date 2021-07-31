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
import typings.log4js.mod.LoggingEvent
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-log4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("koa-log4", "Logger")
  @js.native
  class Logger ()
    extends typings.log4js.mod.Logger
  
  @scala.inline
  def addLayout(
    name: String,
    config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ LoggingEvent, js.Any]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLayout")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def configure(config: Configuration): Log4js = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Log4js]
  @scala.inline
  def configure(filename: String): Log4js = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(filename.asInstanceOf[js.Any]).asInstanceOf[Log4js]
  
  @scala.inline
  def connectLogger(logger: typings.log4js.mod.Logger, options: Context): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connectLogger")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getLogger(): typings.log4js.mod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[typings.log4js.mod.Logger]
  @scala.inline
  def getLogger(category: String): typings.log4js.mod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(category.asInstanceOf[js.Any]).asInstanceOf[typings.log4js.mod.Logger]
  
  @scala.inline
  def koaLogger(logger4js: typings.log4js.mod.Logger): Middleware[DefaultState, DefaultContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("koaLogger")(logger4js.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def koaLogger(logger4js: typings.log4js.mod.Logger, optionsOrFormat: String): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("koaLogger")(logger4js.asInstanceOf[js.Any], optionsOrFormat.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  @scala.inline
  def koaLogger(logger4js: typings.log4js.mod.Logger, optionsOrFormat: Options): Middleware[DefaultState, DefaultContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("koaLogger")(logger4js.asInstanceOf[js.Any], optionsOrFormat.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext]]
  
  @JSImport("koa-log4", "levels")
  @js.native
  val levels: Levels_ = js.native
  
  @scala.inline
  def shutdown(): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Unit | Null]
  @scala.inline
  def shutdown(cb: js.Function1[/* error */ Error, Unit]): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit | Null]
  
  trait Options extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[Level | auto] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLevel(value: Level | auto): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
}
