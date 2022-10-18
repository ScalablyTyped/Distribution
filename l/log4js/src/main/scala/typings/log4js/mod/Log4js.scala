package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log4js extends StObject {
  
  def addLayout(name: String, config: js.Function1[/* a */ Any, js.Function1[/* logEvent */ LoggingEvent, String]]): Unit = js.native
  
  def configure(config: Configuration): Log4js = js.native
  def configure(filename: String): Log4js = js.native
  
  def connectLogger(logger: Logger, options: typings.log4js.anon.Format): Any = js.native
  
  def getLogger(): Logger = js.native
  def getLogger(category: String): Logger = js.native
  
  // express.Handler;
  var levels: Levels_ = js.native
  
  def shutdown(): Unit = js.native
  def shutdown(cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}
