package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttTooltip extends StObject {
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object GanttTooltip {
  
  @scala.inline
  def apply(): GanttTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttTooltip]
  }
  
  @scala.inline
  implicit class GanttTooltipMutableBuilder[Self <: GanttTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
