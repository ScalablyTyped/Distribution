package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisibleClassName extends StObject {
  
  var focusVisibleClassName: js.UndefOr[String] = js.undefined
}
object FocusVisibleClassName {
  
  inline def apply(): FocusVisibleClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusVisibleClassName]
  }
  
  extension [Self <: FocusVisibleClassName](x: Self) {
    
    inline def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
  }
}
