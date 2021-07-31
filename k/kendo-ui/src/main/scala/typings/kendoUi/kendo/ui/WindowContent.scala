package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowContent extends StObject {
  
  var template: js.UndefOr[String] = js.undefined
}
object WindowContent {
  
  @scala.inline
  def apply(): WindowContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowContent]
  }
  
  @scala.inline
  implicit class WindowContentMutableBuilder[Self <: WindowContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
