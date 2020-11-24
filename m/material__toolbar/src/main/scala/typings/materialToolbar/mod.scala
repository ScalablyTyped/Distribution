package typings.materialToolbar

import typings.materialToolbar.adapterMod.MDCToolbarAdapter
import typings.materialToolbar.anon.CHANGEEVENT
import typings.materialToolbar.anon.FIXED
import typings.materialToolbar.anon.MAXTITLESIZE
import typings.materialToolbar.anon.PartialMDCToolbarAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/toolbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCToolbar ()
    extends typings.materialToolbar.componentMod.MDCToolbar
  /* static members */
  @js.native
  object MDCToolbar extends js.Object {
    
    def attachTo(root: Element): typings.materialToolbar.componentMod.MDCToolbar = js.native
  }
  
  @js.native
  class MDCToolbarFoundation ()
    extends typings.materialToolbar.foundationMod.MDCToolbarFoundation {
    def this(adapter: PartialMDCToolbarAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCToolbarFoundation extends js.Object {
    
    val cssClasses: FIXED = js.native
    
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    val numbers: MAXTITLESIZE = js.native
    
    val strings: CHANGEEVENT = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var FIXED: String = js.native
    
    var FIXED_AT_LAST_ROW: String = js.native
    
    var FIXED_LASTROW: String = js.native
    
    var FLEXIBLE_DEFAULT_BEHAVIOR: String = js.native
    
    var FLEXIBLE_MAX: String = js.native
    
    var FLEXIBLE_MIN: String = js.native
    
    var TOOLBAR_ROW_FLEXIBLE: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var MAX_TITLE_SIZE: Double = js.native
    
    var MIN_TITLE_SIZE: Double = js.native
    
    var TOOLBAR_MOBILE_BREAKPOINT: Double = js.native
    
    var TOOLBAR_ROW_HEIGHT: Double = js.native
    
    var TOOLBAR_ROW_MOBILE_HEIGHT: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var CHANGE_EVENT: String = js.native
    
    var FIRST_ROW_SELECTOR: String = js.native
    
    var ICON_SELECTOR: String = js.native
    
    var TITLE_SELECTOR: String = js.native
  }
}
