package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogModal extends StObject {
  
  var preventScroll: js.UndefOr[String] = js.undefined
}
object DialogModal {
  
  inline def apply(): DialogModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogModal]
  }
  
  extension [Self <: DialogModal](x: Self) {
    
    inline def setPreventScroll(value: String): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
