package typings.materialSwitch

import typings.materialBase.observerFoundationMod.MDCObserverFoundation
import typings.materialSwitch.adapterMod.MDCSwitchAdapter
import typings.materialSwitch.adapterMod.MDCSwitchRenderAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/switch/foundation", "MDCSwitchFoundation")
  @js.native
  open class MDCSwitchFoundation protected () extends MDCObserverFoundation[MDCSwitchAdapter] {
    def this(adapter: MDCSwitchAdapter) = this()
    
    /**
      * Event handler for switch click events. Clicking on a switch will toggle its
      * selected state.
      */
    def handleClick(): Unit = js.native
    
    /* protected */ def stopProcessingIfDisabled(): Unit = js.native
  }
  
  @JSImport("@material/switch/foundation", "MDCSwitchRenderFoundation")
  @js.native
  open class MDCSwitchRenderFoundation protected () extends MDCSwitchFoundation {
    def this(adapter: MDCSwitchAdapter) = this()
    
    /* protected */ @JSName("adapter")
    var adapter_MDCSwitchRenderFoundation: MDCSwitchRenderAdapter = js.native
    
    /**
      * Initializes the foundation from a server side rendered (SSR) component.
      * This will sync the adapter's state with the current state of the DOM.
      *
      * This method should be called after `init()`.
      */
    def initFromDOM(): Unit = js.native
    
    /* protected */ def onDisabledChange(): Unit = js.native
    
    /* protected */ def onProcessingChange(): Unit = js.native
    
    /* protected */ def onSelectedChange(): Unit = js.native
    
    /* private */ var toggleClass: Any = js.native
  }
}
