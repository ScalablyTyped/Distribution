package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxRadioOptions extends StObject {
  
  var mini: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object CheckboxRadioOptions {
  
  inline def apply(): CheckboxRadioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxRadioOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxRadioOptions] (val x: Self) extends AnyVal {
    
    inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
