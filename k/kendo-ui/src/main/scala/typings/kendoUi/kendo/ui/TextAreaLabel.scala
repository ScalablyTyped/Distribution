package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAreaLabel extends StObject {
  
  var content: js.UndefOr[String | js.Function] = js.undefined
  
  var floating: js.UndefOr[Boolean] = js.undefined
}
object TextAreaLabel {
  
  @scala.inline
  def apply(): TextAreaLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaLabel]
  }
  
  @scala.inline
  implicit class TextAreaLabelMutableBuilder[Self <: TextAreaLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String | js.Function): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
  }
}
