package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowPosition extends StObject {
  
  var left: js.UndefOr[Double | String] = js.undefined
  
  var top: js.UndefOr[Double | String] = js.undefined
}
object WindowPosition {
  
  @scala.inline
  def apply(): WindowPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowPosition]
  }
  
  @scala.inline
  implicit class WindowPositionMutableBuilder[Self <: WindowPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
