package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typings.inboxsdk.mod.Router.RouteView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyToolbarButtonDescriptor extends js.Object {
  
  var hasDropdown: js.UndefOr[Boolean] = js.native
  
  var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.native
  
  def onClick(event: LegacyToolbarButtonEvent): Unit = js.native
  
  var section: SectionNames = js.native
  
  var title: String = js.native
}
object LegacyToolbarButtonDescriptor {
  
  @scala.inline
  def apply(onClick: LegacyToolbarButtonEvent => Unit, section: SectionNames, title: String): LegacyToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyToolbarButtonDescriptor]
  }
  
  @scala.inline
  implicit class LegacyToolbarButtonDescriptorOps[Self <: LegacyToolbarButtonDescriptor] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: LegacyToolbarButtonEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSection(value: SectionNames): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDropdown(value: Boolean): Self = this.set("hasDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasDropdown: Self = this.set("hasDropdown", js.undefined)
    
    @scala.inline
    def setHideFor(value: /* routeView */ RouteView => Unit): Self = this.set("hideFor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHideFor: Self = this.set("hideFor", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setKeyboardShortcutHandle(value: KeyboardShortcutHandle): Self = this.set("keyboardShortcutHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardShortcutHandle: Self = this.set("keyboardShortcutHandle", js.undefined)
  }
}
