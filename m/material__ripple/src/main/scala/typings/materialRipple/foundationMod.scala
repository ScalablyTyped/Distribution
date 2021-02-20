package typings.materialRipple

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.anon.PartialMDCRippleAdapter
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/ripple/foundation", JSImport.Default)
  @js.native
  class default () extends MDCRippleFoundation {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  
  @JSImport("@material/ripple/foundation", "MDCRippleFoundation")
  @js.native
  class MDCRippleFoundation () extends MDCFoundation[MDCRippleAdapter] {
    def this(adapter: PartialMDCRippleAdapter) = this()
    
    /**
      * @param evt Optional event containing position information.
      */
    def activate(): Unit = js.native
    def activate(evt: Event): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    def handleBlur(): Unit = js.native
    
    def handleFocus(): Unit = js.native
    
    def layout(): Unit = js.native
    
    def setUnbounded(unbounded: Boolean): Unit = js.native
  }
}
