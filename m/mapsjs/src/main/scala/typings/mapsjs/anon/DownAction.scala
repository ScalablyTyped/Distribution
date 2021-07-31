package typings.mapsjs.anon

import typings.mapsjs.mod.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownAction extends StObject {
  
  var downAction: js.UndefOr[js.Function1[/* downPoint */ point, js.Any]] = js.undefined
  
  var dragEnabled: Boolean
  
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ point, Unit]] = js.undefined
  
  var upAction: js.UndefOr[js.Function1[/* upPoint */ point, Unit]] = js.undefined
  
  var useElementInsteadOfNewGestureOverlay: Boolean
  
  var wheelAction: js.UndefOr[js.Function1[/* delta */ Double, Unit]] = js.undefined
}
object DownAction {
  
  @scala.inline
  def apply(dragEnabled: Boolean, useElementInsteadOfNewGestureOverlay: Boolean): DownAction = {
    val __obj = js.Dynamic.literal(dragEnabled = dragEnabled.asInstanceOf[js.Any], useElementInsteadOfNewGestureOverlay = useElementInsteadOfNewGestureOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownAction]
  }
  
  @scala.inline
  implicit class DownActionMutableBuilder[Self <: DownAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownAction(value: /* downPoint */ point => js.Any): Self = StObject.set(x, "downAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownActionUndefined: Self = StObject.set(x, "downAction", js.undefined)
    
    @scala.inline
    def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveAction(value: /* movePoint */ point => Unit): Self = StObject.set(x, "moveAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveActionUndefined: Self = StObject.set(x, "moveAction", js.undefined)
    
    @scala.inline
    def setUpAction(value: /* upPoint */ point => Unit): Self = StObject.set(x, "upAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpActionUndefined: Self = StObject.set(x, "upAction", js.undefined)
    
    @scala.inline
    def setUseElementInsteadOfNewGestureOverlay(value: Boolean): Self = StObject.set(x, "useElementInsteadOfNewGestureOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelAction(value: /* delta */ Double => Unit): Self = StObject.set(x, "wheelAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWheelActionUndefined: Self = StObject.set(x, "wheelAction", js.undefined)
  }
}
