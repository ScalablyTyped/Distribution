package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxMessages extends StObject {
  
  var tools: js.UndefOr[ListBoxMessagesTools] = js.native
}
object ListBoxMessages {
  
  @scala.inline
  def apply(): ListBoxMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxMessages]
  }
  
  @scala.inline
  implicit class ListBoxMessagesMutableBuilder[Self <: ListBoxMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTools(value: ListBoxMessagesTools): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
