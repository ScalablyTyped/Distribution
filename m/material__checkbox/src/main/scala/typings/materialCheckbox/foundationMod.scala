package typings.materialCheckbox

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialCheckbox.adapterMod.MDCCheckboxAdapter
import typings.materialCheckbox.anon.ANIMCHECKEDINDETERMINATE
import typings.materialCheckbox.anon.ANIMENDLATCHMS
import typings.materialCheckbox.anon.ARIACHECKEDATTR
import typings.materialCheckbox.anon.PartialMDCCheckboxAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/checkbox/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
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
  /* static members */
  @js.native
  object MDCCheckboxFoundation extends js.Object {
    
    def cssClasses: ANIMCHECKEDINDETERMINATE = js.native
    
    def defaultAdapter: MDCCheckboxAdapter = js.native
    
    def numbers: ANIMENDLATCHMS = js.native
    
    def strings: ARIACHECKEDATTR = js.native
  }
  
  @js.native
  class default () extends MDCCheckboxFoundation {
    def this(adapter: PartialMDCCheckboxAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: ANIMCHECKEDINDETERMINATE = js.native
    
    def defaultAdapter: MDCCheckboxAdapter = js.native
    
    def numbers: ANIMENDLATCHMS = js.native
    
    def strings: ARIACHECKEDATTR = js.native
  }
}
