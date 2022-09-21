package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialCheckbox.anon.PartialMDCCheckboxAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkbox {
  
  @JSImport("material-components-web", "checkbox.MDCCheckbox")
  @js.native
  open class MDCCheckbox protected ()
    extends typings.materialCheckbox.mod.MDCCheckbox {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialCheckbox.foundationMod.MDCCheckboxFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCCheckbox {
    
    @JSImport("material-components-web", "checkbox.MDCCheckbox")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialCheckbox.componentMod.MDCCheckbox = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialCheckbox.componentMod.MDCCheckbox]
  }
  
  @JSImport("material-components-web", "checkbox.MDCCheckboxFoundation")
  @js.native
  open class MDCCheckboxFoundation ()
    extends typings.materialCheckbox.mod.MDCCheckboxFoundation {
    def this(adapter: PartialMDCCheckboxAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "checkbox.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "checkbox.cssClasses.ANIM_CHECKED_INDETERMINATE")
    @js.native
    def ANIM_CHECKED_INDETERMINATE: String = js.native
    inline def ANIM_CHECKED_INDETERMINATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIM_CHECKED_INDETERMINATE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.ANIM_CHECKED_UNCHECKED")
    @js.native
    def ANIM_CHECKED_UNCHECKED: String = js.native
    inline def ANIM_CHECKED_UNCHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIM_CHECKED_UNCHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.ANIM_INDETERMINATE_CHECKED")
    @js.native
    def ANIM_INDETERMINATE_CHECKED: String = js.native
    inline def ANIM_INDETERMINATE_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIM_INDETERMINATE_CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.ANIM_INDETERMINATE_UNCHECKED")
    @js.native
    def ANIM_INDETERMINATE_UNCHECKED: String = js.native
    inline def ANIM_INDETERMINATE_UNCHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIM_INDETERMINATE_UNCHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.ANIM_UNCHECKED_CHECKED")
    @js.native
    def ANIM_UNCHECKED_CHECKED: String = js.native
    inline def ANIM_UNCHECKED_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIM_UNCHECKED_CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.ANIM_UNCHECKED_INDETERMINATE")
    @js.native
    def ANIM_UNCHECKED_INDETERMINATE: String = js.native
    inline def ANIM_UNCHECKED_INDETERMINATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIM_UNCHECKED_INDETERMINATE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.BACKGROUND")
    @js.native
    def BACKGROUND: String = js.native
    inline def BACKGROUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKGROUND")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.CHECKED")
    @js.native
    def CHECKED: String = js.native
    inline def CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.CHECKMARK")
    @js.native
    def CHECKMARK: String = js.native
    inline def CHECKMARK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.CHECKMARK_PATH")
    @js.native
    def CHECKMARK_PATH: String = js.native
    inline def CHECKMARK_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKMARK_PATH")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.INDETERMINATE")
    @js.native
    def INDETERMINATE: String = js.native
    inline def INDETERMINATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.MIXEDMARK")
    @js.native
    def MIXEDMARK: String = js.native
    inline def MIXEDMARK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIXEDMARK")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.NATIVE_CONTROL")
    @js.native
    def NATIVE_CONTROL: String = js.native
    inline def NATIVE_CONTROL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.SELECTED")
    @js.native
    def SELECTED: String = js.native
    inline def SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.cssClasses.UPGRADED")
    @js.native
    def UPGRADED: String = js.native
    inline def UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "checkbox.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "checkbox.numbers.ANIM_END_LATCH_MS")
    @js.native
    def ANIM_END_LATCH_MS: Double = js.native
    inline def ANIM_END_LATCH_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIM_END_LATCH_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "checkbox.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "checkbox.strings.ARIA_CHECKED_ATTR")
    @js.native
    def ARIA_CHECKED_ATTR: String = js.native
    inline def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.strings.ARIA_CHECKED_INDETERMINATE_VALUE")
    @js.native
    def ARIA_CHECKED_INDETERMINATE_VALUE: String = js.native
    inline def ARIA_CHECKED_INDETERMINATE_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_INDETERMINATE_VALUE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.strings.DATA_INDETERMINATE_ATTR")
    @js.native
    def DATA_INDETERMINATE_ATTR: String = js.native
    inline def DATA_INDETERMINATE_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_INDETERMINATE_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    inline def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.strings.TRANSITION_STATE_CHECKED")
    @js.native
    def TRANSITION_STATE_CHECKED: String = js.native
    inline def TRANSITION_STATE_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.strings.TRANSITION_STATE_INDETERMINATE")
    @js.native
    def TRANSITION_STATE_INDETERMINATE: String = js.native
    inline def TRANSITION_STATE_INDETERMINATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_INDETERMINATE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.strings.TRANSITION_STATE_INIT")
    @js.native
    def TRANSITION_STATE_INIT: String = js.native
    inline def TRANSITION_STATE_INIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_INIT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "checkbox.strings.TRANSITION_STATE_UNCHECKED")
    @js.native
    def TRANSITION_STATE_UNCHECKED: String = js.native
    inline def TRANSITION_STATE_UNCHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_UNCHECKED")(x.asInstanceOf[js.Any])
  }
}
