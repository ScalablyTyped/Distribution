package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowButtonDescriptor extends StObject {
  
  var hasDropdown: js.UndefOr[Boolean] = js.native
  
  var iconClass: js.UndefOr[String] = js.native
  
  var iconUrl: String = js.native
  
  def onClick(event: ThreadRowButtonClickEvent): Unit = js.native
  
  var title: String = js.native
}
object ThreadRowButtonDescriptor {
  
  @scala.inline
  def apply(iconUrl: String, onClick: ThreadRowButtonClickEvent => Unit, title: String): ThreadRowButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonDescriptor]
  }
  
  @scala.inline
  implicit class ThreadRowButtonDescriptorMutableBuilder[Self <: ThreadRowButtonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasDropdown(value: Boolean): Self = StObject.set(x, "hasDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDropdownUndefined: Self = StObject.set(x, "hasDropdown", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: ThreadRowButtonClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
