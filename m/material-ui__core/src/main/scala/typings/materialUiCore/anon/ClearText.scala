package typings.materialUiCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearText extends StObject {
  
  var clearText: js.UndefOr[String] = js.undefined
  
  var closeText: js.UndefOr[String] = js.undefined
  
  var loadingText: js.UndefOr[ReactNode] = js.undefined
  
  var noOptionsText: js.UndefOr[ReactNode] = js.undefined
  
  var openText: js.UndefOr[String] = js.undefined
}
object ClearText {
  
  inline def apply(): ClearText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearText] (val x: Self) extends AnyVal {
    
    inline def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    inline def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    inline def setLoadingText(value: ReactNode): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    inline def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    inline def setNoOptionsText(value: ReactNode): Self = StObject.set(x, "noOptionsText", value.asInstanceOf[js.Any])
    
    inline def setNoOptionsTextUndefined: Self = StObject.set(x, "noOptionsText", js.undefined)
    
    inline def setOpenText(value: String): Self = StObject.set(x, "openText", value.asInstanceOf[js.Any])
    
    inline def setOpenTextUndefined: Self = StObject.set(x, "openText", js.undefined)
  }
}
