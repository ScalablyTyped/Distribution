package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatColorPickerMessages extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  
  var cancel: js.UndefOr[String] = js.undefined
}
object FlatColorPickerMessages {
  
  @scala.inline
  def apply(): FlatColorPickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatColorPickerMessages]
  }
  
  @scala.inline
  implicit class FlatColorPickerMessagesMutableBuilder[Self <: FlatColorPickerMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
