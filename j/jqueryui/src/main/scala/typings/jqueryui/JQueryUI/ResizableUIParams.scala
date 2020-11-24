package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizableUIParams extends js.Object {
  
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
  implicit class ResizableUIParamsOps[Self <: ResizableUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElement(value: JQuery): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelper(value: JQuery): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalElement(value: JQuery): Self = this.set("originalElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPosition(value: js.Any): Self = this.set("originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSize(value: js.Any): Self = this.set("originalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
