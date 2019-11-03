package typings.atMaterialSwitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/switch/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
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
    /** A CSS selector used to locate the native HTML control for the switch.  */
    var NATIVE_CONTROL_SELECTOR: String = js.native
    /** A CSS selector used to locate the ripple surface element for the switch. */
    var RIPPLE_SURFACE_SELECTOR: String = js.native
  }
  
}

