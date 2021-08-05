package typings.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadRowDraftLabelDescriptor extends StObject {
  
  var count: js.UndefOr[String] = js.undefined
  
  var text: String
}
object ThreadRowDraftLabelDescriptor {
  
  inline def apply(text: String): ThreadRowDraftLabelDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowDraftLabelDescriptor]
  }
  
  extension [Self <: ThreadRowDraftLabelDescriptor](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
