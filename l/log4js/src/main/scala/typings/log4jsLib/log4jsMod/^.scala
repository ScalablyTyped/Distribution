package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val levels: log4jsLib.log4jsMod.Levels = js.native
  def addLayout(
    name: java.lang.String,
    config: js.Function1[
      /* a */ js.Any, 
      js.Function1[/* logEvent */ log4jsLib.log4jsMod.LoggingEvent, java.lang.String]
    ]
  ): scala.Unit = js.native
  def configure(config: log4jsLib.log4jsMod.Configuration): log4jsLib.log4jsMod.Log4js = js.native
  def configure(filename: java.lang.String): log4jsLib.log4jsMod.Log4js = js.native
  def connectLogger(logger: log4jsLib.log4jsMod.Logger, options: log4jsLib.Anon_Format): js.Any = js.native
  def getLogger(): log4jsLib.log4jsMod.Logger = js.native
  def getLogger(category: java.lang.String): log4jsLib.log4jsMod.Logger = js.native
  def shutdown(): scala.Unit | scala.Null = js.native
  def shutdown(cb: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit | scala.Null = js.native
}

