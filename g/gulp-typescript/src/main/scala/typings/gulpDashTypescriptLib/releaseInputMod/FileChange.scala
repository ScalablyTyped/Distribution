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
    val __obj = js.Dynamic.literal(current = current, previous = previous, state = state)
  
    __obj.asInstanceOf[FileChange]
  }
}

