package typings.log4js.log4jsMod

import typings.log4js.Anon_Context
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val levels: Levels = js.native
  def addLayout(name: String, config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ LoggingEvent, _]]): Unit = js.native
  def configure(config: Configuration): Log4js = js.native
  def configure(filename: String): Log4js = js.native
  def connectLogger(logger: Logger, options: Anon_Context): js.Any = js.native
  def getLogger(): Logger = js.native
  def getLogger(category: String): Logger = js.native
  def shutdown(): Unit | Null = js.native
  def shutdown(cb: js.Function1[/* error */ Error, Unit]): Unit | Null = js.native
}

