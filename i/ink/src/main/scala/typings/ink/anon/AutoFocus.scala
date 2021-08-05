package typings.ink.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFocus extends StObject {
  
  var autoFocus: Boolean
}
object AutoFocus {
  
  inline def apply(autoFocus: Boolean): AutoFocus = {
    val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus]
  }
  
  extension [Self <: AutoFocus](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
  }
}
