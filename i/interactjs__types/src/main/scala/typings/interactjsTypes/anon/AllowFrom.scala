package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractableMod.IgnoreValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowFrom extends StObject {
  
  var allowFrom: js.UndefOr[IgnoreValue] = js.undefined
  
  var ignoreFrom: js.UndefOr[IgnoreValue] = js.undefined
}
object AllowFrom {
  
  inline def apply(): AllowFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowFrom]
  }
  
  extension [Self <: AllowFrom](x: Self) {
    
    inline def setAllowFrom(value: IgnoreValue): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
    
    inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
    
    inline def setIgnoreFrom(value: IgnoreValue): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
  }
}
