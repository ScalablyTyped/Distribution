package typings.leafletAreaselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaSelectOptions extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var keepAspectRatio: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object AreaSelectOptions {
  
  @scala.inline
  def apply(): AreaSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSelectOptions]
  }
  
  @scala.inline
  implicit class AreaSelectOptionsOps[Self <: AreaSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = this.set("keepAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAspectRatio: Self = this.set("keepAspectRatio", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
