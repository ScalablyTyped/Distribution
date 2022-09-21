package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateEditSender extends StObject {
  
  var validateEditSender: js.UndefOr[AllowEventOnLookupFail] = js.undefined
}
object ValidateEditSender {
  
  inline def apply(): ValidateEditSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateEditSender]
  }
  
  extension [Self <: ValidateEditSender](x: Self) {
    
    inline def setValidateEditSender(value: AllowEventOnLookupFail): Self = StObject.set(x, "validateEditSender", value.asInstanceOf[js.Any])
    
    inline def setValidateEditSenderUndefined: Self = StObject.set(x, "validateEditSender", js.undefined)
  }
}
