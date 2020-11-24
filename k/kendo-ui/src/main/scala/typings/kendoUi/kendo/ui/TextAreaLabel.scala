package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaLabel extends js.Object {
  
  var content: js.UndefOr[String | js.Function] = js.native
  
  var floating: js.UndefOr[Boolean] = js.native
}
object TextAreaLabel {
  
  @scala.inline
  def apply(): TextAreaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaLabel]
  }
  
  @scala.inline
  implicit class TextAreaLabelOps[Self <: TextAreaLabel] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String | js.Function): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
  }
}
