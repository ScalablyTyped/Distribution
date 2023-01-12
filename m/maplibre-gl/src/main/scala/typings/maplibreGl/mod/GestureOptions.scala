package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureOptions extends StObject {
  
  var macHelpText: js.UndefOr[String] = js.undefined
  
  var mobileHelpText: js.UndefOr[String] = js.undefined
  
  var windowsHelpText: js.UndefOr[String] = js.undefined
}
object GestureOptions {
  
  inline def apply(): GestureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GestureOptions] (val x: Self) extends AnyVal {
    
    inline def setMacHelpText(value: String): Self = StObject.set(x, "macHelpText", value.asInstanceOf[js.Any])
    
    inline def setMacHelpTextUndefined: Self = StObject.set(x, "macHelpText", js.undefined)
    
    inline def setMobileHelpText(value: String): Self = StObject.set(x, "mobileHelpText", value.asInstanceOf[js.Any])
    
    inline def setMobileHelpTextUndefined: Self = StObject.set(x, "mobileHelpText", js.undefined)
    
    inline def setWindowsHelpText(value: String): Self = StObject.set(x, "windowsHelpText", value.asInstanceOf[js.Any])
    
    inline def setWindowsHelpTextUndefined: Self = StObject.set(x, "windowsHelpText", js.undefined)
  }
}
