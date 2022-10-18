package typings.materialTabs

import typings.materialBase.Element
import typings.materialTabs.anon.ACTIVE
import typings.materialTabs.anon.PartialMDCTabAdapter
import typings.materialTabs.anon.SELECTEDEVENT
import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabIndexMod {
  
  @JSImport("@material/tabs/tab/index", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialTabs.tabFoundationMod.default {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/tabs/tab/index", "default.cssClasses")
    @js.native
    val cssClasses: ACTIVE = js.native
    
    @JSImport("@material/tabs/tab/index", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabAdapter = js.native
    
    @JSImport("@material/tabs/tab/index", "default.strings")
    @js.native
    val strings: SELECTEDEVENT = js.native
  }
  
  @JSImport("@material/tabs/tab/index", "MDCTab")
  @js.native
  open class MDCTab protected ()
    extends typings.materialTabs.tabComponentMod.MDCTab {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialTabs.tabFoundationMod.MDCTabFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tabs/tab/index", "MDCTab")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTabs.tabComponentMod.MDCTab = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTabs.tabComponentMod.MDCTab]
  }
  
  @JSImport("@material/tabs/tab/index", "MDCTabFoundation")
  @js.native
  open class MDCTabFoundation ()
    extends typings.materialTabs.tabFoundationMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  object MDCTabFoundation {
    
    @JSImport("@material/tabs/tab/index", "MDCTabFoundation.cssClasses")
    @js.native
    val cssClasses: ACTIVE = js.native
    
    @JSImport("@material/tabs/tab/index", "MDCTabFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabAdapter = js.native
    
    @JSImport("@material/tabs/tab/index", "MDCTabFoundation.strings")
    @js.native
    val strings: SELECTEDEVENT = js.native
  }
  
  object tabCssClasses {
    
    @JSImport("@material/tabs/tab/index", "tabCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab/index", "tabCssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    inline def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
  }
  
  object tabStrings {
    
    @JSImport("@material/tabs/tab/index", "tabStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab/index", "tabStrings.SELECTED_EVENT")
    @js.native
    def SELECTED_EVENT: String = js.native
    inline def SELECTED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(x.asInstanceOf[js.Any])
  }
}
