package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait streamStateTransitionData extends js.Object {
  
  var nextState: js.Any = js.native
  
  var previousState: js.Any = js.native
}
object streamStateTransitionData {
  
  @scala.inline
  def apply(nextState: js.Any, previousState: js.Any): streamStateTransitionData = {
    val __obj = js.Dynamic.literal(nextState = nextState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamStateTransitionData]
  }
  
  @scala.inline
  implicit class streamStateTransitionDataOps[Self <: streamStateTransitionData] (val x: Self) extends AnyVal {
    
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
    def setNextState(value: js.Any): Self = this.set("nextState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousState(value: js.Any): Self = this.set("previousState", value.asInstanceOf[js.Any])
  }
}
