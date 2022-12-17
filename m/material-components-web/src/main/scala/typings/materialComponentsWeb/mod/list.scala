package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialList.anon.PartialMDCListAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object list {
  
  @JSImport("material-components-web", "list.MDCList")
  @js.native
  open class MDCList protected ()
    extends typings.materialList.mod.MDCList {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialList.foundationMod.MDCListFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCList {
    
    @JSImport("material-components-web", "list.MDCList")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialList.componentMod.MDCList = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialList.componentMod.MDCList]
  }
  
  @JSImport("material-components-web", "list.MDCListFoundation")
  @js.native
  open class MDCListFoundation ()
    extends typings.materialList.mod.MDCListFoundation {
    def this(adapter: PartialMDCListAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "list.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "list.cssClasses.LIST_ITEM_ACTIVATED_CLASS")
    @js.native
    def LIST_ITEM_ACTIVATED_CLASS: String = js.native
    inline def LIST_ITEM_ACTIVATED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_ACTIVATED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.cssClasses.LIST_ITEM_CLASS")
    @js.native
    def LIST_ITEM_CLASS: String = js.native
    inline def LIST_ITEM_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.cssClasses.LIST_ITEM_DISABLED_CLASS")
    @js.native
    def LIST_ITEM_DISABLED_CLASS: String = js.native
    inline def LIST_ITEM_DISABLED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_DISABLED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.cssClasses.LIST_ITEM_PRIMARY_TEXT_CLASS")
    @js.native
    def LIST_ITEM_PRIMARY_TEXT_CLASS: String = js.native
    inline def LIST_ITEM_PRIMARY_TEXT_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_PRIMARY_TEXT_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.cssClasses.LIST_ITEM_SELECTED_CLASS")
    @js.native
    def LIST_ITEM_SELECTED_CLASS: String = js.native
    inline def LIST_ITEM_SELECTED_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_SELECTED_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.cssClasses.LIST_ITEM_TEXT_CLASS")
    @js.native
    def LIST_ITEM_TEXT_CLASS: String = js.native
    inline def LIST_ITEM_TEXT_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIST_ITEM_TEXT_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("material-components-web", "list.evolutionAttribute")
  @js.native
  val evolutionAttribute: /* "evolution" */ String = js.native
  
  object numbers {
    
    @JSImport("material-components-web", "list.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "list.numbers.TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS")
    @js.native
    def TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS: Double = js.native
    inline def TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPEAHEAD_BUFFER_CLEAR_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.numbers.UNSET_INDEX")
    @js.native
    def UNSET_INDEX: Double = js.native
    inline def UNSET_INDEX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSET_INDEX")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "list.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "list.strings.ACTION_EVENT")
    @js.native
    def ACTION_EVENT: String = js.native
    inline def ACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_CHECKED")
    @js.native
    def ARIA_CHECKED: String = js.native
    inline def ARIA_CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_CHECKED_CHECKBOX_SELECTOR")
    @js.native
    def ARIA_CHECKED_CHECKBOX_SELECTOR: String = js.native
    inline def ARIA_CHECKED_CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_CHECKED_RADIO_SELECTOR")
    @js.native
    def ARIA_CHECKED_RADIO_SELECTOR: String = js.native
    inline def ARIA_CHECKED_RADIO_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_RADIO_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_CURRENT")
    @js.native
    def ARIA_CURRENT: String = js.native
    inline def ARIA_CURRENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CURRENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_DISABLED")
    @js.native
    def ARIA_DISABLED: String = js.native
    inline def ARIA_DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_INTERACTIVE_ROLES_SELECTOR")
    @js.native
    def ARIA_INTERACTIVE_ROLES_SELECTOR: String = js.native
    inline def ARIA_INTERACTIVE_ROLES_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_INTERACTIVE_ROLES_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_MULTI_SELECTABLE_SELECTOR")
    @js.native
    def ARIA_MULTI_SELECTABLE_SELECTOR: String = js.native
    inline def ARIA_MULTI_SELECTABLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_MULTI_SELECTABLE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_ORIENTATION")
    @js.native
    def ARIA_ORIENTATION: String = js.native
    inline def ARIA_ORIENTATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_ORIENTATION")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_ORIENTATION_HORIZONTAL")
    @js.native
    def ARIA_ORIENTATION_HORIZONTAL: String = js.native
    inline def ARIA_ORIENTATION_HORIZONTAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_ORIENTATION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_ROLE_CHECKBOX_SELECTOR")
    @js.native
    def ARIA_ROLE_CHECKBOX_SELECTOR: String = js.native
    inline def ARIA_ROLE_CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_ROLE_CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.ARIA_SELECTED")
    @js.native
    def ARIA_SELECTED: String = js.native
    inline def ARIA_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.CHECKBOX_RADIO_SELECTOR")
    @js.native
    def CHECKBOX_RADIO_SELECTOR: String = js.native
    inline def CHECKBOX_RADIO_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX_RADIO_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.CHECKBOX_SELECTOR")
    @js.native
    def CHECKBOX_SELECTOR: String = js.native
    inline def CHECKBOX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.CHILD_ELEMENTS_TO_TOGGLE_TABINDEX")
    @js.native
    def CHILD_ELEMENTS_TO_TOGGLE_TABINDEX: String = js.native
    inline def CHILD_ELEMENTS_TO_TOGGLE_TABINDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHILD_ELEMENTS_TO_TOGGLE_TABINDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.DEPRECATED_SELECTOR")
    @js.native
    def DEPRECATED_SELECTOR: String = js.native
    inline def DEPRECATED_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEPRECATED_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.FOCUSABLE_CHILD_ELEMENTS")
    @js.native
    def FOCUSABLE_CHILD_ELEMENTS: String = js.native
    inline def FOCUSABLE_CHILD_ELEMENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE_CHILD_ELEMENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.RADIO_SELECTOR")
    @js.native
    def RADIO_SELECTOR: String = js.native
    inline def RADIO_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RADIO_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.SELECTED_ITEM_SELECTOR")
    @js.native
    def SELECTED_ITEM_SELECTOR: String = js.native
    inline def SELECTED_ITEM_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_ITEM_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "list.strings.SELECTION_CHANGE_EVENT")
    @js.native
    def SELECTION_CHANGE_EVENT: String = js.native
    inline def SELECTION_CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_CHANGE_EVENT")(x.asInstanceOf[js.Any])
  }
}
