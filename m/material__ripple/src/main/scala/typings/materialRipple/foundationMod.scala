package typings.materialRipple

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialRipple.adapterMod.MDCRippleAdapter
import typings.materialRipple.anon.PartialMDCRippleAdapter
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/ripple/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCRippleFoundation {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  
  @JSImport("@material/ripple/foundation", "MDCRippleFoundation")
  @js.native
  open class MDCRippleFoundation () extends MDCFoundation[MDCRippleAdapter] {
    def this(adapter: PartialMDCRippleAdapter) = this()
    
    /**
      * @param evt Optional event containing position information.
      */
    def activate(): Unit = js.native
    def activate(evt: Event): Unit = js.native
    
    /* private */ val activateHandler: Any = js.native
    
    /* private */ var activateImpl: Any = js.native
    
    /* private */ var activationAnimationHasEnded: Any = js.native
    
    /* private */ var activationState: Any = js.native
    
    /* private */ var activationTimer: Any = js.native
    
    /* private */ val activationTimerCallback: Any = js.native
    
    /* private */ var animateActivation: Any = js.native
    
    /* private */ var animateDeactivation: Any = js.native
    
    /* private */ val blurHandler: Any = js.native
    
    /* private */ var checkElementMadeActive: Any = js.native
    
    def deactivate(): Unit = js.native
    
    /* private */ val deactivateHandler: Any = js.native
    
    /* private */ var deactivateImpl: Any = js.native
    
    /* private */ var defaultActivationState: Any = js.native
    
    /* private */ var deregisterDeactivationHandlers: Any = js.native
    
    /* private */ var deregisterRootHandlers: Any = js.native
    
    /* private */ var fgDeactivationRemovalTimer: Any = js.native
    
    /* private */ var fgScale: Any = js.native
    
    /* private */ val focusHandler: Any = js.native
    
    /* private */ var frame: Any = js.native
    
    /* private */ var getFgTranslationCoordinates: Any = js.native
    
    def handleBlur(): Unit = js.native
    
    def handleFocus(): Unit = js.native
    
    /* private */ var initialSize: Any = js.native
    
    def layout(): Unit = js.native
    
    /* private */ var layoutFrame: Any = js.native
    
    /* private */ var layoutInternal: Any = js.native
    
    /* private */ var maxRadius: Any = js.native
    
    /* private */ var previousActivationEvent: Any = js.native
    
    /* private */ var registerDeactivationHandlers: Any = js.native
    
    /**
      * supportsPressRipple Passed from init to save a redundant function call
      */
    /* private */ var registerRootHandlers: Any = js.native
    
    /* private */ var removeCssVars: Any = js.native
    
    /* private */ var resetActivationState: Any = js.native
    
    /* private */ val resizeHandler: Any = js.native
    
    /* private */ var rmBoundedActivationClasses: Any = js.native
    
    /* private */ var runDeactivationUXLogicIfReady: Any = js.native
    
    def setUnbounded(unbounded: Boolean): Unit = js.native
    
    /**
      * We compute this property so that we are not querying information about the client
      * until the point in time where the foundation requests it. This prevents scenarios where
      * client-side feature-detection may happen too early, such as when components are rendered on the server
      * and then initialized at mount time on the client.
      */
    /* private */ var supportsPressRipple: Any = js.native
    
    /* private */ var unboundedCoords: Any = js.native
    
    /* private */ var updateLayoutCssVars: Any = js.native
  }
}
