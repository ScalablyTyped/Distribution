package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopOverPopup extends StObject {
  
  var height: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object PopOverPopup {
  
  @scala.inline
  def apply(): PopOverPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopOverPopup]
  }
  
  @scala.inline
  implicit class PopOverPopupMutableBuilder[Self <: PopOverPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
