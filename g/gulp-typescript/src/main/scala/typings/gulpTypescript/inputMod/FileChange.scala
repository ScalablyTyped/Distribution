package typings.gulpTypescript.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileChange extends js.Object {
  
  var current: File = js.native
  
  var previous: File = js.native
  
  var state: FileChangeState = js.native
}
object FileChange {
  
  @scala.inline
  def apply(current: File, previous: File, state: FileChangeState): FileChange = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChange]
  }
  
  @scala.inline
  implicit class FileChangeOps[Self <: FileChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrent(value: File): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: File): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: FileChangeState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
