package typings.grunt.grunt.log

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Grunt output should look consistent, and maybe even pretty.
  * As such, there is a plethora of logging methods, and a few useful patterns.
  * All of the methods that actually log something are chainable.
  */
trait CommonLogging[T] extends js.Object {
  /**
    * If msg string is omitted, logs ERROR in red,
    * otherwise logs >> msg, with trailing newline.
    */
  def error(msg: String): T
  /**
    * Log an error with grunt.log.error, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def errorlns(msg: String): T
  /**
    * If msg string is omitted, logs OK in green, otherwise logs >> msg, with trailing newline.
    */
  def ok(msg: String): T
  /**
    * Log an ok message with grunt.log.ok, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def oklns(msg: String): T
  /**
    * Log the specified msg string in bold, with trailing newline.
    */
  def subhead(msg: String): T
  /**
    * Log an warning with grunt.log.warn
    */
  def warn(msg: String): T
  /**
    * Log the specified msg string, with no trailing newline.
    */
  def write(msg: String): T
  /**
    * Log a list of obj properties (good for debugging flags).
    */
  def writeflags(obj: js.Any): T
  /**
    * Log the specified msg string, with trailing newline.
    */
  def writeln(msg: String): T
}

object CommonLogging {
  @scala.inline
  def apply[T](
    error: String => T,
    errorlns: String => T,
    ok: String => T,
    oklns: String => T,
    subhead: String => T,
    warn: String => T,
    write: String => T,
    writeflags: js.Any => T,
    writeln: String => T
  ): CommonLogging[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), subhead = js.Any.fromFunction1(subhead), warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
  
    __obj.asInstanceOf[CommonLogging[T]]
  }
}

