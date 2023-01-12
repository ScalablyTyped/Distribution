package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanelBarAnimation extends StObject {
  
  var collapse: js.UndefOr[PanelBarAnimationCollapse] = js.undefined
  
  var expand: js.UndefOr[PanelBarAnimationExpand] = js.undefined
}
object PanelBarAnimation {
  
  inline def apply(): PanelBarAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBarAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanelBarAnimation] (val x: Self) extends AnyVal {
    
    inline def setCollapse(value: PanelBarAnimationCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setExpand(value: PanelBarAnimationExpand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
