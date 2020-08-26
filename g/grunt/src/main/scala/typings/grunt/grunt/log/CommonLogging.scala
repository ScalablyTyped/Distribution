package typings.grunt.grunt.log

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Grunt output should look consistent, and maybe even pretty.
  * As such, there is a plethora of logging methods, and a few useful patterns.
  * All of the methods that actually log something are chainable.
  */
@js.native
trait CommonLogging[T] extends js.Object {
  /**
    * If msg string is omitted, logs ERROR in red,
    * otherwise logs >> msg, with trailing newline.
    */
  def error(msg: String): T = js.native
  /**
    * Log an error with grunt.log.error, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def errorlns(msg: String): T = js.native
  /**
    * If msg string is omitted, logs OK in green, otherwise logs >> msg, with trailing newline.
    */
  def ok(msg: String): T = js.native
  /**
    * Log an ok message with grunt.log.ok, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def oklns(msg: String): T = js.native
  /**
    * Log the specified msg string in bold, with trailing newline.
    */
  def subhead(msg: String): T = js.native
  /**
    * Log an warning with grunt.log.warn
    */
  def warn(msg: String): T = js.native
  /**
    * Log the specified msg string, with no trailing newline.
    */
  def write(msg: String): T = js.native
  /**
    * Log a list of obj properties (good for debugging flags).
    */
  def writeflags(obj: js.Any): T = js.native
  /**
    * Log the specified msg string, with trailing newline.
    */
  def writeln(msg: String): T = js.native
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
  @scala.inline
  implicit class CommonLoggingOps[Self <: CommonLogging[_], T] (val x: Self with CommonLogging[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: String => T): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setErrorlns(value: String => T): Self = this.set("errorlns", js.Any.fromFunction1(value))
    @scala.inline
    def setOk(value: String => T): Self = this.set("ok", js.Any.fromFunction1(value))
    @scala.inline
    def setOklns(value: String => T): Self = this.set("oklns", js.Any.fromFunction1(value))
    @scala.inline
    def setSubhead(value: String => T): Self = this.set("subhead", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: String => T): Self = this.set("warn", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: String => T): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteflags(value: js.Any => T): Self = this.set("writeflags", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteln(value: String => T): Self = this.set("writeln", js.Any.fromFunction1(value))
  }
  
}

