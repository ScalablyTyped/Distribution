package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialRadio.anon.PartialMDCRadioAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radio {
  
  @JSImport("material-components-web", "radio.MDCRadio")
  @js.native
  open class MDCRadio protected ()
    extends typings.materialRadio.mod.MDCRadio {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialRadio.foundationMod.MDCRadioFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCRadio {
    
    @JSImport("material-components-web", "radio.MDCRadio")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialRadio.componentMod.MDCRadio = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialRadio.componentMod.MDCRadio]
  }
  
  @JSImport("material-components-web", "radio.MDCRadioFoundation")
  @js.native
  open class MDCRadioFoundation ()
    extends typings.materialRadio.mod.MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "radio.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "radio.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "radio.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "radio.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "radio.strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    inline def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
