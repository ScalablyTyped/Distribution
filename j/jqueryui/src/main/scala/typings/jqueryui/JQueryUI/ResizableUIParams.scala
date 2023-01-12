package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizableUIParams extends StObject {
  
  var element: JQuery
  
  var helper: JQuery
  
  var originalElement: JQuery
  
  var originalPosition: Any
  
  var originalSize: Any
  
  var position: Any
  
  var size: Any
}
object ResizableUIParams {
  
  inline def apply(
    element: JQuery,
    helper: JQuery,
    originalElement: JQuery,
    originalPosition: Any,
    originalSize: Any,
    position: Any,
    size: Any
  ): ResizableUIParams = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], originalElement = originalElement.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableUIParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizableUIParams] (val x: Self) extends AnyVal {
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setOriginalElement(value: JQuery): Self = StObject.set(x, "originalElement", value.asInstanceOf[js.Any])
    
    inline def setOriginalPosition(value: Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setOriginalSize(value: Any): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
