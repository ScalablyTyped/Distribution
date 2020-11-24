package typings.leafletResponsivePopup.mod

import typings.leaflet.mod.PopupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsivePopupOptions extends PopupOptions {
  
  var hasTip: js.UndefOr[Boolean] = js.native
}
object ResponsivePopupOptions {
  
  @scala.inline
  def apply(): ResponsivePopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsivePopupOptions]
  }
  
  @scala.inline
  implicit class ResponsivePopupOptionsOps[Self <: ResponsivePopupOptions] (val x: Self) extends AnyVal {
    
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
    def setHasTip(value: Boolean): Self = this.set("hasTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTip: Self = this.set("hasTip", js.undefined)
  }
}
