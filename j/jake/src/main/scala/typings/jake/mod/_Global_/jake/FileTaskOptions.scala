package typings.jake.mod._Global_.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTaskOptions extends js.Object {
  /**
  		 * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
  		 * @default false
  		 */
  var async: js.UndefOr[Boolean] = js.undefined
}

object FileTaskOptions {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined): FileTaskOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTaskOptions]
  }
}

