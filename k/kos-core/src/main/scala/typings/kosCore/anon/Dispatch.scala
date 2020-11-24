package typings.kosCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatch extends js.Object {
  
  var dispatch: js.Any = js.native
  
  var getState: js.Any = js.native
}
object Dispatch {
  
  @scala.inline
  def apply(dispatch: js.Any, getState: js.Any): Dispatch = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispatch]
  }
  
  @scala.inline
  implicit class DispatchOps[Self <: Dispatch] (val x: Self) extends AnyVal {
    
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
    def setDispatch(value: js.Any): Self = this.set("dispatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: js.Any): Self = this.set("getState", value.asInstanceOf[js.Any])
  }
}
