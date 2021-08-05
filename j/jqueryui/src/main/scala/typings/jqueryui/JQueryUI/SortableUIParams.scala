package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableUIParams extends StObject {
  
  var helper: JQuery
  
  var item: JQuery
  
  var offset: js.Any
  
  var originalPosition: js.Any
  
  var placeholder: JQuery
  
  var position: js.Any
  
  var sender: JQuery
}
object SortableUIParams {
  
  inline def apply(
    helper: JQuery,
    item: JQuery,
    offset: js.Any,
    originalPosition: js.Any,
    placeholder: JQuery,
    position: js.Any,
    sender: JQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableUIParams]
  }
  
  extension [Self <: SortableUIParams](x: Self) {
    
    inline def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSender(value: JQuery): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
