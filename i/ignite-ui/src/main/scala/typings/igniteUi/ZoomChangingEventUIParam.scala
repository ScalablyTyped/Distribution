package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomChangingEventUIParam extends js.Object {
  
  /**
    * Gets reference to igZoombar.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ZoomChangingEventUIParam {
  
  @scala.inline
  def apply(): ZoomChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomChangingEventUIParam]
  }
  
  @scala.inline
  implicit class ZoomChangingEventUIParamOps[Self <: ZoomChangingEventUIParam] (val x: Self) extends AnyVal {
    
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
