package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowDateDescriptor extends StObject {
  
  var text: String
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object ThreadRowDateDescriptor {
  
  @scala.inline
  def apply(text: String): ThreadRowDateDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowDateDescriptor]
  }
  
  @scala.inline
  implicit class ThreadRowDateDescriptorMutableBuilder[Self <: ThreadRowDateDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
