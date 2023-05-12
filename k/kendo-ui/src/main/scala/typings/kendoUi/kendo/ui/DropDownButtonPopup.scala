package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownButtonPopup extends StObject {
  
  var appendTo: js.UndefOr[String] = js.undefined
}
object DropDownButtonPopup {
  
  inline def apply(): DropDownButtonPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownButtonPopup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownButtonPopup] (val x: Self) extends AnyVal {
    
    inline def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
  }
}
