package typings.materialTabs

import typings.materialTabs.anon.ACTIVE
import typings.materialTabs.anon.PartialMDCTabAdapter
import typings.materialTabs.anon.SELECTEDEVENT
import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab/index", JSImport.Namespace)
@js.native
object tabIndexMod extends js.Object {
  
  @js.native
  class MDCTab ()
    extends typings.materialTabs.tabComponentMod.MDCTab
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    
    def attachTo(root: Element): typings.materialTabs.tabComponentMod.MDCTab = js.native
  }
  
  @js.native
  class MDCTabFoundation ()
    extends typings.materialTabs.tabFoundationMod.MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    
    val cssClasses: ACTIVE = js.native
    
    val defaultAdapter: MDCTabAdapter = js.native
    
    val strings: SELECTEDEVENT = js.native
  }
  
  @js.native
  object tabCssClasses extends js.Object {
    
    var ACTIVE: String = js.native
  }
  
  @js.native
  object tabStrings extends js.Object {
    
    var SELECTED_EVENT: String = js.native
  }
}
