package typings.immer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoFreeze extends StObject {
    
    var autoFreeze: js.UndefOr[Boolean] = js.undefined
    
    var useStrictShallowCopy: js.UndefOr[Boolean] = js.undefined
  }
  object AutoFreeze {
    
    inline def apply(): AutoFreeze = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFreeze]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFreeze] (val x: Self) extends AnyVal {
      
      inline def setAutoFreeze(value: Boolean): Self = StObject.set(x, "autoFreeze", value.asInstanceOf[js.Any])
      
      inline def setAutoFreezeUndefined: Self = StObject.set(x, "autoFreeze", js.undefined)
      
      inline def setUseStrictShallowCopy(value: Boolean): Self = StObject.set(x, "useStrictShallowCopy", value.asInstanceOf[js.Any])
      
      inline def setUseStrictShallowCopyUndefined: Self = StObject.set(x, "useStrictShallowCopy", js.undefined)
    }
  }
}
