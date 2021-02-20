package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableUIParams extends StObject {
  
  var helper: JQuery = js.native
  
  var item: JQuery = js.native
  
  var offset: js.Any = js.native
  
  var originalPosition: js.Any = js.native
  
  var placeholder: JQuery = js.native
  
  var position: js.Any = js.native
  
  var sender: JQuery = js.native
}
object SortableUIParams {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SortableUIParamsMutableBuilder[Self <: SortableUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: JQuery): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
