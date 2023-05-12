package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownButtonMessages extends StObject {
  
  var labelSuffix: js.UndefOr[String] = js.undefined
}
object DropDownButtonMessages {
  
  inline def apply(): DropDownButtonMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownButtonMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownButtonMessages] (val x: Self) extends AnyVal {
    
    inline def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
    
    inline def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
  }
}
