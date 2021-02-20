package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollingEventUIParam extends StObject {
  
  /**
    * Gets if the content is scrolled by the scrollbar track areas. 0 - none used, -1 - Scrolled Up/Left, 1 - Scrolled Down/Right.
    */
  var bigIncrement: js.UndefOr[Double] = js.native
  
  /**
    * Gets which axis is being used to scroll - horizontal(true) or vertical(false).
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a reference to the igScroll.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets if the content is scrolled by the arrows. 0 - none used, -1 - Arrow Up/Left, 1 - Arrow Down/Right.
    */
  var smallIncrement: js.UndefOr[Double] = js.native
  
  /**
    * Gets how much the content will be scrolled horizontally.
    */
  var stepX: js.UndefOr[Double] = js.native
  
  /**
    * Gets how much the content will be scrolled vertically.
    */
  var stepY: js.UndefOr[Double] = js.native
}
object ScrollingEventUIParam {
  
  @scala.inline
  def apply(): ScrollingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollingEventUIParam]
  }
  
  @scala.inline
  implicit class ScrollingEventUIParamMutableBuilder[Self <: ScrollingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigIncrement(value: Double): Self = StObject.set(x, "bigIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIncrementUndefined: Self = StObject.set(x, "bigIncrement", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSmallIncrement(value: Double): Self = StObject.set(x, "smallIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallIncrementUndefined: Self = StObject.set(x, "smallIncrement", js.undefined)
    
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
