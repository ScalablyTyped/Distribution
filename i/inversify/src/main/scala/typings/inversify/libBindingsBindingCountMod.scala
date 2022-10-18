package typings.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsBindingCountMod {
  
  object BindingCount {
    
    @JSImport("inversify/lib/bindings/binding_count", "BindingCount")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify/lib/bindings/binding_count", "BindingCount.MultipleBindingsAvailable")
    @js.native
    def MultipleBindingsAvailable: Double = js.native
    inline def MultipleBindingsAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultipleBindingsAvailable")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify/lib/bindings/binding_count", "BindingCount.NoBindingsAvailable")
    @js.native
    def NoBindingsAvailable: Double = js.native
    inline def NoBindingsAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoBindingsAvailable")(x.asInstanceOf[js.Any])
    
    @JSImport("inversify/lib/bindings/binding_count", "BindingCount.OnlyOneBindingAvailable")
    @js.native
    def OnlyOneBindingAvailable: Double = js.native
    inline def OnlyOneBindingAvailable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnlyOneBindingAvailable")(x.asInstanceOf[js.Any])
  }
}
