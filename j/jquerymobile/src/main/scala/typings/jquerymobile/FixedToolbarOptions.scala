package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedToolbarOptions extends js.Object {
  
  var disablePageZoom: js.UndefOr[Boolean] = js.native
  
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  var hideDuringFocus: js.UndefOr[String] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var supportBlacklist: js.UndefOr[js.Function] = js.native
  
  var tapToggle: js.UndefOr[Boolean] = js.native
  
  var tapToggleBlacklist: js.UndefOr[String] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var updatePagePadding: js.UndefOr[Boolean] = js.native
  
  var visibleOnPageShow: js.UndefOr[Boolean] = js.native
}
object FixedToolbarOptions {
  
  @scala.inline
  def apply(): FixedToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedToolbarOptions]
  }
  
  @scala.inline
  implicit class FixedToolbarOptionsOps[Self <: FixedToolbarOptions] (val x: Self) extends AnyVal {
    
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
    def setDisablePageZoom(value: Boolean): Self = this.set("disablePageZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePageZoom: Self = this.set("disablePageZoom", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setHideDuringFocus(value: String): Self = this.set("hideDuringFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDuringFocus: Self = this.set("hideDuringFocus", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    
    @scala.inline
    def setSupportBlacklist(value: js.Function): Self = this.set("supportBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportBlacklist: Self = this.set("supportBlacklist", js.undefined)
    
    @scala.inline
    def setTapToggle(value: Boolean): Self = this.set("tapToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapToggle: Self = this.set("tapToggle", js.undefined)
    
    @scala.inline
    def setTapToggleBlacklist(value: String): Self = this.set("tapToggleBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapToggleBlacklist: Self = this.set("tapToggleBlacklist", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setUpdatePagePadding(value: Boolean): Self = this.set("updatePagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatePagePadding: Self = this.set("updatePagePadding", js.undefined)
    
    @scala.inline
    def setVisibleOnPageShow(value: Boolean): Self = this.set("visibleOnPageShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleOnPageShow: Self = this.set("visibleOnPageShow", js.undefined)
  }
}
