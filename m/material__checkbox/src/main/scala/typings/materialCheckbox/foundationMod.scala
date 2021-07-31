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
  class default () extends MDCCheckboxFoundation {
    def this(adapter: PartialMDCCheckboxAdapter) = this()
  }
  
  @JSImport("@material/checkbox/foundation", "MDCCheckboxFoundation")
  @js.native
  class MDCCheckboxFoundation () extends MDCFoundation[MDCCheckboxAdapter] {
    def this(adapter: PartialMDCCheckboxAdapter) = this()
    
    /**
      * Handles the animationend event for the checkbox
      */
    def handleAnimationEnd(): Unit = js.native
    
    /**
      * Handles the change event for the checkbox
      */
    def handleChange(): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
