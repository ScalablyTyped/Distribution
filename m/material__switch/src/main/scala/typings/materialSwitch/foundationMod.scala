package typings.materialSwitch

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSwitch.adapterMod.MDCSwitchAdapter
import typings.materialSwitch.anon.ARIACHECKEDATTR
import typings.materialSwitch.anon.CHECKED
import typings.materialSwitch.anon.PartialMDCSwitchAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/switch/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCSwitchFoundation () extends MDCFoundation[MDCSwitchAdapter] {
    def this(adapter: PartialMDCSwitchAdapter) = this()
    /** Handles the change event for the switch native control. */
    def handleChange(evt: Event): Unit = js.native
    /** Sets the checked state of the switch. */
    def setChecked(checked: Boolean): Unit = js.native
    /** Sets the disabled state of the switch. */
    def setDisabled(disabled: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCSwitchFoundation {
    def this(adapter: PartialMDCSwitchAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCSwitchFoundation extends js.Object {
    /** The CSS classes used by the switch. */
    def cssClasses: CHECKED = js.native
    /** The default Adapter for the switch. */
    def defaultAdapter: MDCSwitchAdapter = js.native
    /** The string constants used by the switch. */
    def strings: ARIACHECKEDATTR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /** The CSS classes used by the switch. */
    def cssClasses: CHECKED = js.native
    /** The default Adapter for the switch. */
    def defaultAdapter: MDCSwitchAdapter = js.native
    /** The string constants used by the switch. */
    def strings: ARIACHECKEDATTR = js.native
  }
  
}

