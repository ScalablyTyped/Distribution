package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputOptions extends js.Object {
  
  var clearBtn: js.UndefOr[Boolean] = js.native
  
  var clearBtnText: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var mini: js.UndefOr[Boolean] = js.native
  
  var preventFocusZoom: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object TextInputOptions {
  
  @scala.inline
  def apply(): TextInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputOptions]
  }
  
  @scala.inline
  implicit class TextInputOptionsOps[Self <: TextInputOptions] (val x: Self) extends AnyVal {
    
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
    def setClearBtn(value: Boolean): Self = this.set("clearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBtn: Self = this.set("clearBtn", js.undefined)
    
    @scala.inline
    def setClearBtnText(value: String): Self = this.set("clearBtnText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBtnText: Self = this.set("clearBtnText", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    
    @scala.inline
    def setPreventFocusZoom(value: Boolean): Self = this.set("preventFocusZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventFocusZoom: Self = this.set("preventFocusZoom", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
