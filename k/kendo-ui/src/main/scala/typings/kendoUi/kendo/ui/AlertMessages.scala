package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertMessages extends StObject {
  
  var okText: js.UndefOr[String] = js.undefined
}
object AlertMessages {
  
  inline def apply(): AlertMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertMessages] (val x: Self) extends AnyVal {
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
  }
}
