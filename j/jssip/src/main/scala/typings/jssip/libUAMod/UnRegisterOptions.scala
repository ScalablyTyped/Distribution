package typings.jssip.libUAMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnRegisterOptions extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
}
object UnRegisterOptions {
  
  inline def apply(): UnRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnRegisterOptions]
  }
  
  extension [Self <: UnRegisterOptions](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
  }
}
