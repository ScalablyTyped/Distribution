package typings.grunt.gruntNs.taskNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncResultCatcher extends js.Object {
  def apply(): Unit = js.native
  def apply(error: Error): Unit = js.native
  def apply(result: js.Any): Unit = js.native
  /**
    * Either false or an Error object may be passed to the done function
    * to instruct Grunt that the task has failed.
    */
  def apply(success: Boolean): Unit = js.native
}

