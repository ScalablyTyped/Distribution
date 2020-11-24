package typings.log4js.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4js", "Logger")
@js.native
class Logger ()
  extends Instantiable2[/* dispatch */ js.Function, /* name */ String, Logger] {
  
  def _log(level: String, data: js.Any): Unit = js.native
  
  def addContext(key: String, value: js.Any): Unit = js.native
  
  val category: String = js.native
  
  def clearContext(): Unit = js.native
  
  def debug(message: js.Any, args: js.Any*): Unit = js.native
  
  def error(message: js.Any, args: js.Any*): Unit = js.native
  
  def fatal(message: js.Any, args: js.Any*): Unit = js.native
  
  def info(message: js.Any, args: js.Any*): Unit = js.native
  
  def isDebugEnabled(): Boolean = js.native
  
  def isErrorEnabled(): Boolean = js.native
  
  def isFatalEnabled(): Boolean = js.native
  
  def isInfoEnabled(): Boolean = js.native
  
  def isLevelEnabled(): Boolean = js.native
  def isLevelEnabled(level: String): Boolean = js.native
  
  def isTraceEnabled(): Boolean = js.native
  
  def isWarnEnabled(): Boolean = js.native
  
  var level: String = js.native
  
  def log(args: js.Any*): Unit = js.native
  
  def mark(message: js.Any, args: js.Any*): Unit = js.native
  
  def removeContext(key: String): Unit = js.native
  
  def setParseCallStackFunction(parseFunction: js.Function): Unit = js.native
  
  def trace(message: js.Any, args: js.Any*): Unit = js.native
  
  def warn(message: js.Any, args: js.Any*): Unit = js.native
}
