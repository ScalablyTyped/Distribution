package typings.materialComponentsWeb.mod

import typings.materialSwitch.adapterMod.MDCSwitchAdapter
import typings.materialSwitch.anon.ARIACHECKEDATTR
import typings.materialSwitch.anon.CHECKED
import typings.materialSwitch.anon.PartialMDCSwitchAdapter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "switchControl")
@js.native
object switchControl extends js.Object {
  @js.native
  class MDCSwitch ()
    extends typings.materialSwitch.mod.MDCSwitch
  
  @js.native
  class MDCSwitchFoundation ()
    extends typings.materialSwitch.mod.MDCSwitchFoundation {
    def this(adapter: PartialMDCSwitchAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCSwitch extends js.Object {
    def attachTo(root: HTMLElement): typings.materialSwitch.componentMod.MDCSwitch = js.native
  }
  
  /* static members */
  @js.native
  object MDCSwitchFoundation extends js.Object {
    /** The CSS classes used by the switch. */
    val cssClasses: CHECKED = js.native
    /** The default Adapter for the switch. */
    val defaultAdapter: MDCSwitchAdapter = js.native
    /** The string constants used by the switch. */
    val strings: ARIACHECKEDATTR = js.native
  }
  
  /** CSS classes used by the switch. */
  @js.native
  object cssClasses extends js.Object {
    /** Class used for a switch that is in the "checked" (on) position. */
    var CHECKED: String = js.native
    /** Class used for a switch that is disabled. */
    var DISABLED: String = js.native
  }
  
  /** String constants used by the switch. */
  @js.native
  object strings extends js.Object {
    /** Aria attribute for checked or unchecked state of switch */
    var ARIA_CHECKED_ATTR: String = js.native
    /** A CSS selector used to locate the native HTML control for the switch.  */
    var NATIVE_CONTROL_SELECTOR: String = js.native
    /** A CSS selector used to locate the ripple surface element for the switch. */
    var RIPPLE_SURFACE_SELECTOR: String = js.native
  }
  
}

