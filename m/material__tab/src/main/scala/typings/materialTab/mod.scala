package typings.materialTab

import typings.materialBase.Element
import typings.materialTab.anon.PartialMDCTabAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/tab", "MDCTab")
  @js.native
  open class MDCTab protected ()
    extends typings.materialTab.componentMod.MDCTab {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialTab.foundationMod.MDCTabFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tab", "MDCTab")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTab.componentMod.MDCTab = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTab.componentMod.MDCTab]
  }
  
  @JSImport("@material/tab", "MDCTabFoundation")
  @js.native
  open class MDCTabFoundation ()
    extends typings.materialTab.foundationMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/tab", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab", "cssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    inline def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/tab", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tab", "strings.ARIA_SELECTED")
    @js.native
    def ARIA_SELECTED: String = js.native
    inline def ARIA_SELECTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SELECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    inline def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.INTERACTED_EVENT")
    @js.native
    def INTERACTED_EVENT: String = js.native
    inline def INTERACTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.RIPPLE_SELECTOR")
    @js.native
    def RIPPLE_SELECTOR: String = js.native
    inline def RIPPLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIPPLE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.TABINDEX")
    @js.native
    def TABINDEX: String = js.native
    inline def TABINDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TABINDEX")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tab", "strings.TAB_INDICATOR_SELECTOR")
    @js.native
    def TAB_INDICATOR_SELECTOR: String = js.native
    inline def TAB_INDICATOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDICATOR_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
