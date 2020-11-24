package typings.jestRunner.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherState extends js.Object {
  
  var interrupted: Boolean = js.native
}
object WatcherState {
  
  @scala.inline
  def apply(interrupted: Boolean): WatcherState = {
    val __obj = js.Dynamic.literal(interrupted = interrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherState]
  }
  
  @scala.inline
  implicit class WatcherStateOps[Self <: WatcherState] (val x: Self) extends AnyVal {
    
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
    def setInterrupted(value: Boolean): Self = this.set("interrupted", value.asInstanceOf[js.Any])
  }
}
