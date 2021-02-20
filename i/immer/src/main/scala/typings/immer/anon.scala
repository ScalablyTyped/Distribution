package typings.immer

import typings.immer.mod.ImmerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoFreeze extends StObject {
    
    var autoFreeze: js.UndefOr[Boolean] = js.native
    
    var onAssign: js.UndefOr[
        js.Function3[/* state */ ImmerState[_], /* keyof any */ /* prop */ String, /* value */ js.Any, Unit]
      ] = js.native
    
    var onCopy: js.UndefOr[js.Function1[/* state */ ImmerState[_], Unit]] = js.native
    
    var onDelete: js.UndefOr[js.Function2[/* state */ ImmerState[_], /* keyof any */ /* prop */ String, Unit]] = js.native
    
    var useProxies: js.UndefOr[Boolean] = js.native
  }
  object AutoFreeze {
    
    @scala.inline
    def apply(): AutoFreeze = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFreeze]
    }
    
    @scala.inline
    implicit class AutoFreezeMutableBuilder[Self <: AutoFreeze] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFreeze(value: Boolean): Self = StObject.set(x, "autoFreeze", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFreezeUndefined: Self = StObject.set(x, "autoFreeze", js.undefined)
      
      @scala.inline
      def setOnAssign(value: (/* state */ ImmerState[_], /* keyof any */ /* prop */ String, /* value */ js.Any) => Unit): Self = StObject.set(x, "onAssign", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnAssignUndefined: Self = StObject.set(x, "onAssign", js.undefined)
      
      @scala.inline
      def setOnCopy(value: /* state */ ImmerState[_] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnDelete(value: (/* state */ ImmerState[_], /* keyof any */ /* prop */ String) => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setUseProxies(value: Boolean): Self = StObject.set(x, "useProxies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseProxiesUndefined: Self = StObject.set(x, "useProxies", js.undefined)
    }
  }
}
