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
  
  inline def apply(): FlatColorPickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatColorPickerMessages]
  }
  
  extension [Self <: FlatColorPickerMessages](x: Self) {
    
    inline def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
