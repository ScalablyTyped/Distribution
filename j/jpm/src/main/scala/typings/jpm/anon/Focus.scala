package typings.jpm.anon

import typings.jpm.panelMod.PanelPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  var focus: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[PanelPosition] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Focus {
  
  @scala.inline
  def apply(): Focus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focus]
  }
  
  @scala.inline
  implicit class FocusMutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPosition(value: PanelPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
