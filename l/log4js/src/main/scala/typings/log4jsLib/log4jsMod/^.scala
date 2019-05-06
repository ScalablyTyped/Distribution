package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val levels: Levels = js.native
  def addLayout(
    name: java.lang.String,
    config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ LoggingEvent, _]]
  ): scala.Unit = js.native
  def configure(config: Configuration): Log4js = js.native
  def configure(filename: java.lang.String): Log4js = js.native
  def connectLogger(logger: Logger, options: log4jsLib.Anon_FormatLevel): js.Any = js.native
  def getLogger(): Logger = js.native
  def getLogger(category: java.lang.String): Logger = js.native
  def shutdown(): scala.Unit | scala.Null = js.native
  def shutdown(cb: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit | scala.Null = js.native
}

