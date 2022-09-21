package typings.materialCheckbox

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialCheckbox.adapterMod.MDCCheckboxAdapter
import typings.materialCheckbox.anon.PartialMDCCheckboxAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/checkbox/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCCheckboxFoundation {
    def this(adapter: PartialMDCCheckboxAdapter) = this()
  }
  
  @JSImport("@material/checkbox/foundation", "MDCCheckboxFoundation")
  @js.native
  open class MDCCheckboxFoundation () extends MDCFoundation[MDCCheckboxAdapter] {
    def this(adapter: PartialMDCCheckboxAdapter) = this()
    
    /* private */ var animEndLatchTimer: Any = js.native
    
    /* private */ var currentAnimationClass: Any = js.native
    
    /* private */ var currentCheckState: Any = js.native
    
    /* private */ var determineCheckState: Any = js.native
    
    /* private */ var enableAnimationEndHandler: Any = js.native
    
    /* private */ var getTransitionAnimationClass: Any = js.native
    
    /**
      * Handles the animationend event for the checkbox
      */
    def handleAnimationEnd(): Unit = js.native
    
    /**
      * Handles the change event for the checkbox
      */
    def handleChange(): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
    
    /* private */ var transitionCheckState: Any = js.native
    
    /* private */ var updateAriaChecked: Any = js.native
  }
}
