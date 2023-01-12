package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDescriptorBase extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var foregroundColor: js.UndefOr[String] = js.undefined
  
  var iconBackgroundColor: js.UndefOr[String] = js.undefined
  
  var title: String
}
object LabelDescriptorBase {
  
  inline def apply(title: String): LabelDescriptorBase = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelDescriptorBase] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setIconBackgroundColor(value: String): Self = StObject.set(x, "iconBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setIconBackgroundColorUndefined: Self = StObject.set(x, "iconBackgroundColor", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
