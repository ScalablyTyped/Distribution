package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewAnimation extends StObject {
  
  var collapse: js.UndefOr[Boolean | TreeViewAnimationCollapse] = js.undefined
  
  var expand: js.UndefOr[Boolean | TreeViewAnimationExpand] = js.undefined
}
object TreeViewAnimation {
  
  @scala.inline
  def apply(): TreeViewAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewAnimation]
  }
  
  @scala.inline
  implicit class TreeViewAnimationMutableBuilder[Self <: TreeViewAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapse(value: Boolean | TreeViewAnimationCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean | TreeViewAnimationExpand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
