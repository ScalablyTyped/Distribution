package typings.materialSwitch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  /** CSS classes used by the switch. */
  object cssClasses {
    
    @JSImport("@material/switch/constants", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    /** Class used for a switch that is in the "checked" (on) position. */
    @JSImport("@material/switch/constants", "cssClasses.CHECKED")
    @js.native
    def CHECKED: String = js.native
    @scala.inline
    def CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKED")(x.asInstanceOf[js.Any])
    
    /** Class used for a switch that is disabled. */
    @JSImport("@material/switch/constants", "cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    @scala.inline
    def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
  }
  
  /** String constants used by the switch. */
  object strings {
    
    @JSImport("@material/switch/constants", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    /** Aria attribute for checked or unchecked state of switch */
    @JSImport("@material/switch/constants", "strings.ARIA_CHECKED_ATTR")
    @js.native
    def ARIA_CHECKED_ATTR: String = js.native
    @scala.inline
    def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
    
    /** A CSS selector used to locate the native HTML control for the switch.  */
    @JSImport("@material/switch/constants", "strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    @scala.inline
    def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
    
    /** A CSS selector used to locate the ripple surface element for the switch. */
    @JSImport("@material/switch/constants", "strings.RIPPLE_SURFACE_SELECTOR")
    @js.native
    def RIPPLE_SURFACE_SELECTOR: String = js.native
    @scala.inline
    def RIPPLE_SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIPPLE_SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
