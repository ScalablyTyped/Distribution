package typings.grunt.grunt.task

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
