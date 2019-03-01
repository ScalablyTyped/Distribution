package typings
package gulpDashTypescriptLib.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChange extends js.Object {
  var current: File
  var previous: File
  var state: FileChangeState
}

object FileChange {
  @scala.inline
  def apply(current: File, previous: File, state: FileChangeState): FileChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("previous")(previous)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[FileChange]
  }
}

