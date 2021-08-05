package typings.inboxsdk.mod.Lists

import typings.inboxsdk.mod.Common.DropdownView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowButtonClickEvent extends StObject {
  
  var dropdown: js.UndefOr[DropdownView] = js.undefined
  
  var threadRowView: ThreadRowView
}
object ThreadRowButtonClickEvent {
  
  inline def apply(threadRowView: ThreadRowView): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal(threadRowView = threadRowView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
  
  extension [Self <: ThreadRowButtonClickEvent](x: Self) {
    
    inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
    
    inline def setThreadRowView(value: ThreadRowView): Self = StObject.set(x, "threadRowView", value.asInstanceOf[js.Any])
  }
}
