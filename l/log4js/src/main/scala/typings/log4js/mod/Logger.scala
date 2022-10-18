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
  
  /**
    * Adjust the value of linesToSkip when the parseFunction is called.
    *
    * Cannot be less than 0.
    */
  var callStackLinesToSkip: Double = js.native
  
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
  
  /**
    * Replace the basic parse function with a new custom one
    * - Note that linesToSkip will be based on the origin of the Error object in addition to the callStackLinesToSkip (at least 1)
    * @param parseFunction the new parseFunction. Use `undefined` to reset to the base implementation
    */
  def setParseCallStackFunction(parseFunction: js.Function2[/* error */ js.Error, /* linesToSkip */ Double, js.UndefOr[CallStack]]): Unit = js.native
  
  def trace(message: Any, args: Any*): Unit = js.native
  
  def warn(message: Any, args: Any*): Unit = js.native
}
