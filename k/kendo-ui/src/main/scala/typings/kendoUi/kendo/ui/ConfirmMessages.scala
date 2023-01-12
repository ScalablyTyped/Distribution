package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmMessages extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var okText: js.UndefOr[String] = js.undefined
}
object ConfirmMessages {
  
  inline def apply(): ConfirmMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmMessages] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
  }
}
