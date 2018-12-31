package typings
package gruntLib.gruntNs.failNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailModule extends js.Object {
  /**
    * Display a warning and abort Grunt immediately.
    */
  def fatal(error: java.lang.String): scala.Unit = js.native
  def fatal(error: java.lang.String, errorCode: ErrorCode): scala.Unit = js.native
  def fatal(error: nodeLib.Error): scala.Unit = js.native
  def fatal(error: nodeLib.Error, errorCode: ErrorCode): scala.Unit = js.native
  /**
    * Display a warning and abort Grunt immediately.
    * Grunt will continue processing tasks if the --force command-line option was specified.
    */
  def warn(error: java.lang.String): scala.Unit = js.native
  def warn(error: java.lang.String, errorCode: ErrorCode): scala.Unit = js.native
  def warn(error: nodeLib.Error): scala.Unit = js.native
  def warn(error: nodeLib.Error, errorCode: ErrorCode): scala.Unit = js.native
}

