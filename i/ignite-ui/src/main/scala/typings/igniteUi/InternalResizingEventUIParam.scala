package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalResizingEventUIParam extends js.Object {
  
  /**
    * Used to get a reference to the layout manager performing resizing.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object InternalResizingEventUIParam {
  
  @scala.inline
  def apply(): InternalResizingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalResizingEventUIParam]
  }
  
  @scala.inline
  implicit class InternalResizingEventUIParamOps[Self <: InternalResizingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
