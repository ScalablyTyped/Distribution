package typings.jqueryDynatree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynaTreeCookieOptions extends StObject {
  
  var expires: Any
}
object DynaTreeCookieOptions {
  
  inline def apply(expires: Any): DynaTreeCookieOptions = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeCookieOptions]
  }
  
  extension [Self <: DynaTreeCookieOptions](x: Self) {
    
    inline def setExpires(value: Any): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
  }
}
