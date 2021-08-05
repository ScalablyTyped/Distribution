package typings.materialChips

import typings.materialChips.anon.PartialMDCChipTrailingAct
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingactionIndexMod {
  
  @JSImport("@material/chips/trailingaction/index", "MDCChipTrailingAction")
  @js.native
  class MDCChipTrailingAction protected ()
    extends typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCChipTrailingAction {
    
    @JSImport("@material/chips/trailingaction/index", "MDCChipTrailingAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction]
  }
  
  @JSImport("@material/chips/trailingaction/index", "MDCChipTrailingActionFoundation")
  @js.native
  class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  object trailingActionStrings {
    
    @JSImport("@material/chips/trailingaction/index", "trailingActionStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/trailingaction/index", "trailingActionStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/trailingaction/index", "trailingActionStrings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    inline def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/trailingaction/index", "trailingActionStrings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    inline def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/trailingaction/index", "trailingActionStrings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    inline def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
  }
}
