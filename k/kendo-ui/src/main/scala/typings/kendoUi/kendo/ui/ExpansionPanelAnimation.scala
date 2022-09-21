package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionPanelAnimation extends StObject {
  
  var collapse: js.UndefOr[ExpansionPanelAnimationCollapse] = js.undefined
  
  var expand: js.UndefOr[ExpansionPanelAnimationExpand] = js.undefined
}
object ExpansionPanelAnimation {
  
  inline def apply(): ExpansionPanelAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionPanelAnimation]
  }
  
  extension [Self <: ExpansionPanelAnimation](x: Self) {
    
    inline def setCollapse(value: ExpansionPanelAnimationCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setExpand(value: ExpansionPanelAnimationExpand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
