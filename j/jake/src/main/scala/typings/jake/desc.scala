package typings.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("desc")
@js.native
object desc extends js.Object {
  /**
    * Creates a description for a Jake Task (or FileTask, DirectoryTask). When invoked, the description that iscreated will be associated with whatever Task is created next.
    * @param description The description for the Task
    */
  def apply(description: String): Unit = js.native
}

