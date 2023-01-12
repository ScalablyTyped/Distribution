package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableUIParams extends StObject {
  
  var helper: JQuery
  
  var item: JQuery
  
  var offset: Any
  
  var originalPosition: Any
  
  var placeholder: JQuery
  
  var position: Any
  
  var sender: JQuery
}
object SortableUIParams {
  
  inline def apply(
    helper: JQuery,
    item: JQuery,
    offset: Any,
    originalPosition: Any,
    placeholder: JQuery,
    position: Any,
    sender: JQuery
  ): SortableUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableUIParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortableUIParams] (val x: Self) extends AnyVal {
    
    inline def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOriginalPosition(value: Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSender(value: JQuery): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
