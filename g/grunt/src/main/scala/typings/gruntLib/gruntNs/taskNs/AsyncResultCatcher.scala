package typings
package gruntLib.gruntNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncResultCatcher extends js.Object {
  def apply(): scala.Unit = js.native
  def apply(error: nodeLib.Error): scala.Unit = js.native
  def apply(result: js.Any): scala.Unit = js.native
  /**
               * Either false or an Error object may be passed to the done function
               * to instruct Grunt that the task has failed.
               */
  def apply(success: scala.Boolean): scala.Unit = js.native
}

