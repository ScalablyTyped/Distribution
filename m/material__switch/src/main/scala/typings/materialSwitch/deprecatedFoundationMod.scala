package typings.materialSwitch

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSwitch.anon.PartialMDCSwitchAdapter
import typings.materialSwitch.deprecatedAdapterMod.MDCSwitchAdapter
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedFoundationMod {
  
  @JSImport("@material/switch/deprecated/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCSwitchFoundation {
    def this(adapter: PartialMDCSwitchAdapter) = this()
  }
  
  @JSImport("@material/switch/deprecated/foundation", "MDCSwitchFoundation")
  @js.native
  open class MDCSwitchFoundation () extends MDCFoundation[MDCSwitchAdapter] {
    def this(adapter: PartialMDCSwitchAdapter) = this()
    
    /** Handles the change event for the switch native control. */
    def handleChange(evt: Event): Unit = js.native
    
    /** Sets the checked state of the switch. */
    def setChecked(checked: Boolean): Unit = js.native
    
    /** Sets the disabled state of the switch. */
    def setDisabled(disabled: Boolean): Unit = js.native
    
    /* private */ var updateAriaChecked: Any = js.native
    
    /** Updates the styling of the switch based on its checked state. */
    /* private */ var updateCheckedStyling: Any = js.native
  }
}
