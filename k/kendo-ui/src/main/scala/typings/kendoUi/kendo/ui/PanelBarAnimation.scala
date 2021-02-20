package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelBarAnimation extends StObject {
  
  var collapse: js.UndefOr[PanelBarAnimationCollapse] = js.native
  
  var expand: js.UndefOr[PanelBarAnimationExpand] = js.native
}
object PanelBarAnimation {
  
  @scala.inline
  def apply(): PanelBarAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelBarAnimation]
  }
  
  @scala.inline
  implicit class PanelBarAnimationMutableBuilder[Self <: PanelBarAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: PanelBarAnimationCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setExpand(value: PanelBarAnimationExpand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
