package typings.materialChips

import typings.materialBase.Element
import typings.materialChips.anon.PartialMDCChipTrailingAct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedTrailingactionMod {
  
  @JSImport("@material/chips/deprecated/trailingaction", "MDCChipTrailingAction")
  @js.native
  open class MDCChipTrailingAction protected ()
    extends typings.materialChips.deprecatedTrailingactionComponentMod.MDCChipTrailingAction {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialChips.deprecatedTrailingactionFoundationMod.MDCChipTrailingActionFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCChipTrailingAction {
    
    @JSImport("@material/chips/deprecated/trailingaction", "MDCChipTrailingAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialChips.deprecatedTrailingactionComponentMod.MDCChipTrailingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialChips.deprecatedTrailingactionComponentMod.MDCChipTrailingAction]
  }
  
  @JSImport("@material/chips/deprecated/trailingaction", "MDCChipTrailingActionFoundation")
  @js.native
  open class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.deprecatedTrailingactionFoundationMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  
  object trailingActionStrings {
    
    @JSImport("@material/chips/deprecated/trailingaction", "trailingActionStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated/trailingaction", "trailingActionStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated/trailingaction", "trailingActionStrings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    inline def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated/trailingaction", "trailingActionStrings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    inline def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated/trailingaction", "trailingActionStrings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    inline def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
  }
}
