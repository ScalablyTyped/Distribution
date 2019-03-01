package typings
package gruntLib.gruntNs.logNs

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
  def error(msg: java.lang.String): T
  /**
    * Log an error with grunt.log.error, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def errorlns(msg: java.lang.String): T
  /**
    * If msg string is omitted, logs OK in green, otherwise logs >> msg, with trailing newline.
    */
  def ok(msg: java.lang.String): T
  /**
    * Log an ok message with grunt.log.ok, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def oklns(msg: java.lang.String): T
  /**
    * Log the specified msg string in bold, with trailing newline.
    */
  def subhead(msg: java.lang.String): T
  /**
    * Log an warning with grunt.log.warn
    */
  def warn(msg: java.lang.String): T
  /**
    * Log the specified msg string, with no trailing newline.
    */
  def write(msg: java.lang.String): T
  /**
    * Log a list of obj properties (good for debugging flags).
    */
  def writeflags(obj: js.Any): T
  /**
    * Log the specified msg string, with trailing newline.
    */
  def writeln(msg: java.lang.String): T
}

object CommonLogging {
  @scala.inline
  def apply[T](
    error: js.Function1[java.lang.String, T],
    errorlns: js.Function1[java.lang.String, T],
    ok: js.Function1[java.lang.String, T],
    oklns: js.Function1[java.lang.String, T],
    subhead: js.Function1[java.lang.String, T],
    warn: js.Function1[java.lang.String, T],
    write: js.Function1[java.lang.String, T],
    writeflags: js.Function1[js.Any, T],
    writeln: js.Function1[java.lang.String, T]
  ): CommonLogging[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("errorlns")(errorlns)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("oklns")(oklns)
    __obj.updateDynamic("subhead")(subhead)
    __obj.updateDynamic("warn")(warn)
    __obj.updateDynamic("write")(write)
    __obj.updateDynamic("writeflags")(writeflags)
    __obj.updateDynamic("writeln")(writeln)
    __obj.asInstanceOf[CommonLogging[T]]
  }
}

