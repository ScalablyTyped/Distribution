package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentPanelDescriptor extends StObject {
  
  var appIconUrl: js.UndefOr[String] = js.undefined
  
  var appName: js.UndefOr[String] = js.undefined
  
  var el: HTMLElement
  
  var hideTitleBar: js.UndefOr[Boolean] = js.undefined
  
  var iconUrl: String
  
  var id: js.UndefOr[String] = js.undefined
  
  var orderHint: js.UndefOr[Double] = js.undefined
  
  var title: String
}
object ContentPanelDescriptor {
  
  inline def apply(el: HTMLElement, iconUrl: String, title: String): ContentPanelDescriptor = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPanelDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentPanelDescriptor] (val x: Self) extends AnyVal {
    
    inline def setAppIconUrl(value: String): Self = StObject.set(x, "appIconUrl", value.asInstanceOf[js.Any])
    
    inline def setAppIconUrlUndefined: Self = StObject.set(x, "appIconUrl", js.undefined)
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setHideTitleBar(value: Boolean): Self = StObject.set(x, "hideTitleBar", value.asInstanceOf[js.Any])
    
    inline def setHideTitleBarUndefined: Self = StObject.set(x, "hideTitleBar", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
    
    inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
