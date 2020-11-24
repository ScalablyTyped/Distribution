package typings.humaneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumaneMessageOptions extends js.Object {
  
  var addnCls: js.UndefOr[String] = js.native
  
  var clickToClose: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var waitForMove: js.UndefOr[Boolean] = js.native
}
object HumaneMessageOptions {
  
  @scala.inline
  def apply(): HumaneMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumaneMessageOptions]
  }
  
  @scala.inline
  implicit class HumaneMessageOptionsOps[Self <: HumaneMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setAddnCls(value: String): Self = this.set("addnCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddnCls: Self = this.set("addnCls", js.undefined)
    
    @scala.inline
    def setClickToClose(value: Boolean): Self = this.set("clickToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToClose: Self = this.set("clickToClose", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWaitForMove(value: Boolean): Self = this.set("waitForMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForMove: Self = this.set("waitForMove", js.undefined)
  }
}
