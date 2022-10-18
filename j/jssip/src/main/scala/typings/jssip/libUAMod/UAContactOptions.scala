package typings.jssip.libUAMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UAContactOptions extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var outbound: js.UndefOr[Boolean] = js.undefined
}
object UAContactOptions {
  
  inline def apply(): UAContactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UAContactOptions]
  }
  
  extension [Self <: UAContactOptions](x: Self) {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setOutbound(value: Boolean): Self = StObject.set(x, "outbound", value.asInstanceOf[js.Any])
    
    inline def setOutboundUndefined: Self = StObject.set(x, "outbound", js.undefined)
  }
}
