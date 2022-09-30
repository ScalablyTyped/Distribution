package typings.listr2.mod

import typings.listr2.anon.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A internal logger for using in the verbose renderer mostly.
  */
@JSImport("listr2", "Logger")
@js.native
open class Logger () extends StObject {
  def this(options: LoggerOptions) = this()
  
  def data(message: String): Unit = js.native
  
  def fail(message: String): Unit = js.native
  
  /* protected */ def logColoring(hasLevelMessage: Level): String = js.native
  
  /* private */ var options: Any = js.native
  
  /* protected */ def parseMessage(level: LogLevels, message: String): String = js.native
  
  def retry(message: String): Unit = js.native
  
  def rollback(message: String): Unit = js.native
  
  def skip(message: String): Unit = js.native
  
  def start(message: String): Unit = js.native
  
  def success(message: String): Unit = js.native
  
  def title(message: String): Unit = js.native
  
  /* private */ var wrapInBrackets: Any = js.native
}
