package typings
package koaDashLog4Lib.koaDashLog4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-log4", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val levels: log4jsLib.log4jsMod.Levels = js.native
  def addLayout(
    name: java.lang.String,
    config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ log4jsLib.log4jsMod.LoggingEvent, _]]
  ): scala.Unit = js.native
  def configure(config: log4jsLib.log4jsMod.Configuration): log4jsLib.log4jsMod.Log4js = js.native
  def configure(filename: java.lang.String): log4jsLib.log4jsMod.Log4js = js.native
  def connectLogger(logger: log4jsLib.log4jsMod.Logger, options: log4jsLib.Anon_FormatLevel): js.Any = js.native
  def getLogger(): log4jsLib.log4jsMod.Logger = js.native
  def getLogger(category: java.lang.String): log4jsLib.log4jsMod.Logger = js.native
  def koaLogger(logger4js: log4jsLib.log4jsMod.Logger): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def koaLogger(logger4js: log4jsLib.log4jsMod.Logger, optionsOrFormat: java.lang.String): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def koaLogger(logger4js: log4jsLib.log4jsMod.Logger, optionsOrFormat: Options): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def shutdown(): scala.Unit | scala.Null = js.native
  def shutdown(cb: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit | scala.Null = js.native
}

