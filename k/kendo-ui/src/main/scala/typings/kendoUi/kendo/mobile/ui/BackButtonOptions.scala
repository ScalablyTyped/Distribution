package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackButtonOptions extends StObject {
  
  var click: js.UndefOr[js.Function1[/* e */ BackButtonClickEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object BackButtonOptions {
  
  inline def apply(): BackButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setClick(value: /* e */ BackButtonClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
