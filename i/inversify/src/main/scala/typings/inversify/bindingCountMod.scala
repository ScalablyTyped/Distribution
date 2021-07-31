package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingCountMod {
  
  object BindingCount {
    
    @JSImport("inversify/dts/bindings/binding_count", "BindingCount")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify/dts/bindings/binding_count", "BindingCount.MultipleBindingsAvailable")
    @js.native
    def MultipleBindingsAvailable: Double = js.native
    @scala.inline
    def MultipleBindingsAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultipleBindingsAvailable")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify/dts/bindings/binding_count", "BindingCount.NoBindingsAvailable")
    @js.native
    def NoBindingsAvailable: Double = js.native
    @scala.inline
    def NoBindingsAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoBindingsAvailable")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify/dts/bindings/binding_count", "BindingCount.OnlyOneBindingAvailable")
    @js.native
    def OnlyOneBindingAvailable: Double = js.native
    @scala.inline
    def OnlyOneBindingAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnlyOneBindingAvailable")(x.asInstanceOf[js.Any])
  }
}
