package typings.jqueryLeanmodal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryLeanModalOption extends StObject {
  
  var closeButton: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object JQueryLeanModalOption {
  
  @scala.inline
  def apply(): JQueryLeanModalOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryLeanModalOption]
  }
  
  @scala.inline
  implicit class JQueryLeanModalOptionMutableBuilder[Self <: JQueryLeanModalOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseButton(value: String): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setOverlay(value: Double): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
