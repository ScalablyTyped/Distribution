package typings.immer

import typings.immer.mod.ImmerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoFreeze extends StObject {
    
    var autoFreeze: js.UndefOr[Boolean] = js.undefined
    
    var onAssign: js.UndefOr[
        js.Function3[
          /* state */ ImmerState[js.Any], 
          /* keyof any */ /* prop */ String, 
          /* value */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var onCopy: js.UndefOr[js.Function1[/* state */ ImmerState[js.Any], Unit]] = js.undefined
    
    var onDelete: js.UndefOr[
        js.Function2[/* state */ ImmerState[js.Any], /* keyof any */ /* prop */ String, Unit]
      ] = js.undefined
    
    var useProxies: js.UndefOr[Boolean] = js.undefined
  }
  object AutoFreeze {
    
    inline def apply(): AutoFreeze = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFreeze]
    }
    
    extension [Self <: AutoFreeze](x: Self) {
      
      inline def setAutoFreeze(value: Boolean): Self = StObject.set(x, "autoFreeze", value.asInstanceOf[js.Any])
      
      inline def setAutoFreezeUndefined: Self = StObject.set(x, "autoFreeze", js.undefined)
      
      inline def setOnAssign(
        value: (/* state */ ImmerState[js.Any], /* keyof any */ /* prop */ String, /* value */ js.Any) => Unit
      ): Self = StObject.set(x, "onAssign", js.Any.fromFunction3(value))
      
      inline def setOnAssignUndefined: Self = StObject.set(x, "onAssign", js.undefined)
      
      inline def setOnCopy(value: /* state */ ImmerState[js.Any] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      inline def setOnDelete(value: (/* state */ ImmerState[js.Any], /* keyof any */ /* prop */ String) => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setUseProxies(value: Boolean): Self = StObject.set(x, "useProxies", value.asInstanceOf[js.Any])
      
      inline def setUseProxiesUndefined: Self = StObject.set(x, "useProxies", js.undefined)
    }
  }
}
