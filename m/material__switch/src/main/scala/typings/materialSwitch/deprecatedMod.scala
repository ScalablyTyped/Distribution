package typings.materialSwitch

import typings.materialBase.Element
import typings.materialSwitch.anon.PartialMDCSwitchAdapter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedMod {
  
  @JSImport("@material/switch/deprecated", "MDCSwitch")
  @js.native
  open class MDCSwitch protected ()
    extends typings.materialSwitch.deprecatedComponentMod.MDCSwitch {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialSwitch.foundationMod.MDCSwitchFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCSwitch {
    
    @JSImport("@material/switch/deprecated", "MDCSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: HTMLElement): typings.materialSwitch.deprecatedComponentMod.MDCSwitch = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSwitch.deprecatedComponentMod.MDCSwitch]
  }
  
  @JSImport("@material/switch/deprecated", "MDCSwitchFoundation")
  @js.native
  open class MDCSwitchFoundation ()
    extends typings.materialSwitch.foundationMod.MDCSwitchFoundation {
    def this(adapter: PartialMDCSwitchAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/switch/deprecated", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    /** Class used for a switch that is in the "checked" (on) position. */
    @JSImport("@material/switch/deprecated", "cssClasses.CHECKED")
    @js.native
    def CHECKED: String = js.native
    inline def CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKED")(x.asInstanceOf[js.Any])
    
    /** Class used for a switch that is disabled. */
    @JSImport("@material/switch/deprecated", "cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
  }
  
  /** String constants used by the switch. */
  object strings {
    
    @JSImport("@material/switch/deprecated", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    /** Aria attribute for checked or unchecked state of switch */
    @JSImport("@material/switch/deprecated", "strings.ARIA_CHECKED_ATTR")
    @js.native
    def ARIA_CHECKED_ATTR: String = js.native
    inline def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
    
    /** A CSS selector used to locate the native HTML control for the switch.  */
    @JSImport("@material/switch/deprecated", "strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    inline def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
    
    /** A CSS selector used to locate the ripple surface element for the switch. */
    @JSImport("@material/switch/deprecated", "strings.RIPPLE_SURFACE_SELECTOR")
    @js.native
    def RIPPLE_SURFACE_SELECTOR: String = js.native
    inline def RIPPLE_SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIPPLE_SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
