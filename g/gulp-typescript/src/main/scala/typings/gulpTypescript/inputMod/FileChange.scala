package typings.gulpTypescript.inputMod

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
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileChange]
  }
}

