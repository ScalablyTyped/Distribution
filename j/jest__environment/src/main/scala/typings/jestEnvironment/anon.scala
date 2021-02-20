package typings.jestEnvironment

import typings.jestTypes.globalMod.HookFn
import typings.jestTypes.globalMod.TestFn
import typings.jestTypes.globalMod.TestName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(testName: TestName, fn: TestFn): Unit = js.native
    def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  }
  
  @js.native
  trait FnCallFnTimeout extends StObject {
    
    def apply(fn: HookFn): Unit = js.native
    def apply(fn: HookFn, timeout: Double): Unit = js.native
  }
  
  @js.native
  trait Virtual extends StObject {
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object Virtual {
    
    @scala.inline
    def apply(): Virtual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Virtual]
    }
    
    @scala.inline
    implicit class VirtualMutableBuilder[Self <: Virtual] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
