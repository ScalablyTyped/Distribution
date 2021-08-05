package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDescriptorUrl
  extends StObject
     with LabelDescriptorBase
     with LabelDescriptor {
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var iconUrl: String
}
object LabelDescriptorUrl {
  
  inline def apply(iconUrl: String, title: String): LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorUrl]
  }
  
  extension [Self <: LabelDescriptorUrl](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
  }
}
