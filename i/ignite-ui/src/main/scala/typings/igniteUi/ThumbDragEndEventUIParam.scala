package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbDragEndEventUIParam extends StObject {
  
  /**
    * Gets which scrollbar thumb is being used - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ThumbDragEndEventUIParam {
  
  @scala.inline
  def apply(): ThumbDragEndEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbDragEndEventUIParam]
  }
  
  @scala.inline
  implicit class ThumbDragEndEventUIParamMutableBuilder[Self <: ThumbDragEndEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
