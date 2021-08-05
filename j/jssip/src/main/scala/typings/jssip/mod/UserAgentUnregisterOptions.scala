package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentUnregisterOptions extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
}
object UserAgentUnregisterOptions {
  
  inline def apply(): UserAgentUnregisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentUnregisterOptions]
  }
  
  extension [Self <: UserAgentUnregisterOptions](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
  }
}
