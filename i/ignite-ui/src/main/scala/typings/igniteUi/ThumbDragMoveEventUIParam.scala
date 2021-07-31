package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbDragMoveEventUIParam extends StObject {
  
  /**
    * Gets which scrollbar thumb is being used - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets how much the content will be scrolled horizontally.
    */
  var stepX: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets how much the content will be scrolled vertically.
    */
  var stepY: js.UndefOr[Double] = js.undefined
}
object ThumbDragMoveEventUIParam {
  
  @scala.inline
  def apply(): ThumbDragMoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbDragMoveEventUIParam]
  }
  
  @scala.inline
  implicit class ThumbDragMoveEventUIParamMutableBuilder[Self <: ThumbDragMoveEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setStepX(value: Double): Self = StObject.set(x, "stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepXUndefined: Self = StObject.set(x, "stepX", js.undefined)
    
    @scala.inline
    def setStepY(value: Double): Self = StObject.set(x, "stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepYUndefined: Self = StObject.set(x, "stepY", js.undefined)
  }
}
