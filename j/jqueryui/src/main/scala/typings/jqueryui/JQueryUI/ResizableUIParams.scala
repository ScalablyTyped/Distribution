package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizableUIParams extends StObject {
  
  var element: JQuery = js.native
  
  var helper: JQuery = js.native
  
  var originalElement: JQuery = js.native
  
  var originalPosition: js.Any = js.native
  
  var originalSize: js.Any = js.native
  
  var position: js.Any = js.native
  
  var size: js.Any = js.native
}
object ResizableUIParams {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ResizableUIParamsMutableBuilder[Self <: ResizableUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelper(value: JQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalElement(value: JQuery): Self = StObject.set(x, "originalElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSize(value: js.Any): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
