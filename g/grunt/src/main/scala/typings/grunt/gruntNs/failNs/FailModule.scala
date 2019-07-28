package typings.grunt.gruntNs.failNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailModule extends js.Object {
  /**
    * Display a warning and abort Grunt immediately.
    */
  def fatal(error: java.lang.String): Unit = js.native
  def fatal(error: java.lang.String, errorCode: ErrorCode): Unit = js.native
  def fatal(error: Error): Unit = js.native
  def fatal(error: Error, errorCode: ErrorCode): Unit = js.native
  /**
    * Display a warning and abort Grunt immediately.
    * Grunt will continue processing tasks if the --force command-line option was specified.
    */
  def warn(error: java.lang.String): Unit = js.native
  def warn(error: java.lang.String, errorCode: ErrorCode): Unit = js.native
  def warn(error: Error): Unit = js.native
  def warn(error: Error, errorCode: ErrorCode): Unit = js.native
}

