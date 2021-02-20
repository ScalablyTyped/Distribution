package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridGroupable extends StObject {
  
  var compare: js.UndefOr[js.Function] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var messages: js.UndefOr[GridGroupableMessages] = js.native
  
  var showFooter: js.UndefOr[Boolean] = js.native
}
object GridGroupable {
  
  @scala.inline
  def apply(): GridGroupable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGroupable]
  }
  
  @scala.inline
  implicit class GridGroupableMutableBuilder[Self <: GridGroupable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: js.Function): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMessages(value: GridGroupableMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
  }
}
