package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseText extends StObject {
  
  var closeText: js.UndefOr[String] = js.undefined
}
object CloseText {
  
  inline def apply(): CloseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseText]
  }
  
  extension [Self <: CloseText](x: Self) {
    
    inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
  }
}
