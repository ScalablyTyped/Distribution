package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowAttachmentIconDescriptorBase extends StObject {
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object ThreadRowAttachmentIconDescriptorBase {
  
  inline def apply(): ThreadRowAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptorBase]
  }
  
  extension [Self <: ThreadRowAttachmentIconDescriptorBase](x: Self) {
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
