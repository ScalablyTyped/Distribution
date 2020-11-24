package typings.materialChips

import typings.materialChips.anon.ARIAHIDDEN
import typings.materialChips.anon.PartialMDCChipTrailingAct
import typings.materialChips.trailingactionAdapterMod.MDCChipTrailingActionAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/trailingaction/index", JSImport.Namespace)
@js.native
object trailingactionIndexMod extends js.Object {
  
  @js.native
  class MDCChipTrailingAction ()
    extends typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction
  /* static members */
  @js.native
  object MDCChipTrailingAction extends js.Object {
    
    def attachTo(root: Element): typings.materialChips.trailingactionComponentMod.MDCChipTrailingAction = js.native
  }
  
  @js.native
  class MDCChipTrailingActionFoundation ()
    extends typings.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation {
    def this(adapter: PartialMDCChipTrailingAct) = this()
  }
  /* static members */
  @js.native
  object MDCChipTrailingActionFoundation extends js.Object {
    
    def defaultAdapter: MDCChipTrailingActionAdapter = js.native
    
    def strings: ARIAHIDDEN = js.native
  }
  
  @js.native
  object trailingActionStrings extends js.Object {
    
    var ARIA_HIDDEN: String = js.native
    
    var INTERACTION_EVENT: String = js.native
    
    var NAVIGATION_EVENT: String = js.native
    
    var TAB_INDEX: String = js.native
  }
}
