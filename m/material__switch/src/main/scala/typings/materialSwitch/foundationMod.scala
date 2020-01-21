package typings.materialSwitch

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSwitch.adapterMod.MDCSwitchAdapter
import typings.std.Event_
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/switch/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCSwitchFoundation () extends MDCFoundation[MDCSwitchAdapter] {
    def this(adapter: Partial[MDCSwitchAdapter]) = this()
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /** Handles the change event for the switch native control. */
    def handleChange(evt: Event_): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
    /** Sets the checked state of the switch. */
    def setChecked(checked: Boolean): Unit = js.native
    /** Sets the disabled state of the switch. */
    def setDisabled(disabled: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCSwitchFoundation {
    def this(adapter: Partial[MDCSwitchAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCSwitchFoundation extends js.Object {
    /** The CSS classes used by the switch. */
    val cssClasses: AnonCHECKED = js.native
    /** The default Adapter for the switch. */
    val defaultAdapter: MDCSwitchAdapter = js.native
    /** The string constants used by the switch. */
    val strings: AnonNATIVECONTROLSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /** The CSS classes used by the switch. */
    val cssClasses: AnonCHECKED = js.native
    /** The default Adapter for the switch. */
    val defaultAdapter: MDCSwitchAdapter = js.native
    /** The string constants used by the switch. */
    val strings: AnonNATIVECONTROLSELECTOR = js.native
  }
  
}

