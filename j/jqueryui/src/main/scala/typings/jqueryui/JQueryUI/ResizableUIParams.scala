package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizableUIParams extends StObject {
  
  var element: JQuery
  
  var helper: JQuery
  
  var originalElement: JQuery
  
  var originalPosition: js.Any
  
  var originalSize: js.Any
  
  var position: js.Any
  
  var size: js.Any
}
object ResizableUIParams {
  
  inline def apply(
    element: JQuery,
    helper: JQuery,
    originalElement: JQuery,
    originalPosition: js.Any,
    originalSize: js.Any,
    position: js.Any,
    size: js.Any
  ): ResizableUIParams = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], originalElement = originalElement.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableUIParams]
  }
  
  extension [Self <: ResizableUIParams](x: Self) {
    
    inline def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setOriginalElement(value: JQuery): Self = StObject.set(x, "originalElement", value.asInstanceOf[js.Any])
    
    inline def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    inline def setOriginalSize(value: js.Any): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
