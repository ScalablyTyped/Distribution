package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowEventOnLookupFail extends StObject {
  
  var allowEventOnLookupFail: Boolean
}
object AllowEventOnLookupFail {
  
  inline def apply(allowEventOnLookupFail: Boolean): AllowEventOnLookupFail = {
    val __obj = js.Dynamic.literal(allowEventOnLookupFail = allowEventOnLookupFail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowEventOnLookupFail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowEventOnLookupFail] (val x: Self) extends AnyVal {
    
    inline def setAllowEventOnLookupFail(value: Boolean): Self = StObject.set(x, "allowEventOnLookupFail", value.asInstanceOf[js.Any])
  }
}
