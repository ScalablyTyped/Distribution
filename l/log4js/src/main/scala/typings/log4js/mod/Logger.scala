package typings.log4js.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger
  extends StObject
     with Instantiable1[/* name */ String, Logger] {
  
  def _log(level: Level, data: Any): Unit = js.native
  
  def addContext(key: String, value: Any): Unit = js.native
  
  val category: String = js.native
  
  def clearContext(): Unit = js.native
  
  def debug(message: Any, args: Any*): Unit = js.native
  
  def error(message: Any, args: Any*): Unit = js.native
  
  def fatal(message: Any, args: Any*): Unit = js.native
  
  def info(message: Any, args: Any*): Unit = js.native
  
  def isDebugEnabled(): Boolean = js.native
  
  def isErrorEnabled(): Boolean = js.native
  
  def isFatalEnabled(): Boolean = js.native
  
  def isInfoEnabled(): Boolean = js.native
  
  def isLevelEnabled(): Boolean = js.native
  def isLevelEnabled(level: String): Boolean = js.native
  
  def isTraceEnabled(): Boolean = js.native
  
  def isWarnEnabled(): Boolean = js.native
  
  var level: Level | String = js.native
  
  def log(level: String, args: Any*): Unit = js.native
  def log(level: Level, args: Any*): Unit = js.native
  
  def mark(message: Any, args: Any*): Unit = js.native
  
  def removeContext(key: String): Unit = js.native
  
  def setParseCallStackFunction(parseFunction: js.Function): Unit = js.native
  
  def trace(message: Any, args: Any*): Unit = js.native
  
  def warn(message: Any, args: Any*): Unit = js.native
}
