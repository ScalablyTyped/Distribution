package typings.highlightJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// perhaps make this an interface?
trait RegexEitherOptions extends StObject {
  
  var capture: js.UndefOr[Boolean] = js.undefined
}
object RegexEitherOptions {
  
  inline def apply(): RegexEitherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexEitherOptions]
  }
  
  extension [Self <: RegexEitherOptions](x: Self) {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
  }
}
