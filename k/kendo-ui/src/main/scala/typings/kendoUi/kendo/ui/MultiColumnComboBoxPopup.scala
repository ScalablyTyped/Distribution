package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnComboBoxPopup extends StObject {
  
  var appendTo: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object MultiColumnComboBoxPopup {
  
  @scala.inline
  def apply(): MultiColumnComboBoxPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnComboBoxPopup]
  }
  
  @scala.inline
  implicit class MultiColumnComboBoxPopupMutableBuilder[Self <: MultiColumnComboBoxPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
