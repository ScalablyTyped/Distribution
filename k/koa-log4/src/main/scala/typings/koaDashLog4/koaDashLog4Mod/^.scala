package typings.koaDashLog4.koaDashLog4Mod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.log4js.Anon_Context
import typings.log4js.log4jsMod.Configuration
import typings.log4js.log4jsMod.Levels
import typings.log4js.log4jsMod.Log4js
import typings.log4js.log4jsMod.LoggingEvent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-log4", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val levels: Levels = js.native
  def addLayout(name: String, config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ LoggingEvent, _]]): Unit = js.native
  def configure(config: Configuration): Log4js = js.native
  def configure(filename: String): Log4js = js.native
  def connectLogger(logger: typings.log4js.log4jsMod.Logger, options: Anon_Context): js.Any = js.native
  def getLogger(): typings.log4js.log4jsMod.Logger = js.native
  def getLogger(category: String): typings.log4js.log4jsMod.Logger = js.native
  def koaLogger(logger4js: typings.log4js.log4jsMod.Logger): Middleware[DefaultState, DefaultContext] = js.native
  def koaLogger(logger4js: typings.log4js.log4jsMod.Logger, optionsOrFormat: String): Middleware[DefaultState, DefaultContext] = js.native
  def koaLogger(logger4js: typings.log4js.log4jsMod.Logger, optionsOrFormat: Options): Middleware[DefaultState, DefaultContext] = js.native
  def shutdown(): Unit | Null = js.native
  def shutdown(cb: js.Function1[/* error */ Error, Unit]): Unit | Null = js.native
}

