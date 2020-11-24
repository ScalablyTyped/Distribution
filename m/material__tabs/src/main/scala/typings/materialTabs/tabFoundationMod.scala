package typings.materialTabs

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabs.anon.ACTIVE
import typings.materialTabs.anon.PartialMDCTabAdapter
import typings.materialTabs.anon.SELECTEDEVENT
import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab/foundation", JSImport.Namespace)
@js.native
object tabFoundationMod extends js.Object {
  
  @js.native
  class MDCTabFoundation () extends MDCFoundation[MDCTabAdapter] {
    def this(adapter: PartialMDCTabAdapter) = this()
    
    def getComputedLeft(): Double = js.native
    
    def getComputedWidth(): Double = js.native
    
    def isActive(): Boolean = js.native
    
    def measureSelf(): Unit = js.native
    
    def preventsDefaultOnClick(): Boolean = js.native
    
    def setActive(isActive: Boolean): Unit = js.native
    
    def setPreventDefaultOnClick(preventDefaultOnClick: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    
    val cssClasses: ACTIVE = js.native
    
    val defaultAdapter: MDCTabAdapter = js.native
    
    val strings: SELECTEDEVENT = js.native
  }
  
  @js.native
  class default () extends MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    val cssClasses: ACTIVE = js.native
    
    val defaultAdapter: MDCTabAdapter = js.native
    
    val strings: SELECTEDEVENT = js.native
  }
}
