package typings.materialTabs

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTabs.anon.ACTIVE
import typings.materialTabs.anon.PartialMDCTabAdapter
import typings.materialTabs.anon.SELECTEDEVENT
import typings.materialTabs.tabAdapterMod.MDCTabAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabFoundationMod {
  
  @JSImport("@material/tabs/tab/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/tabs/tab/foundation", "default.cssClasses")
    @js.native
    val cssClasses: ACTIVE = js.native
    
    @JSImport("@material/tabs/tab/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabAdapter = js.native
    
    @JSImport("@material/tabs/tab/foundation", "default.strings")
    @js.native
    val strings: SELECTEDEVENT = js.native
  }
  
  @JSImport("@material/tabs/tab/foundation", "MDCTabFoundation")
  @js.native
  open class MDCTabFoundation () extends MDCFoundation[MDCTabAdapter] {
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
  object MDCTabFoundation {
    
    @JSImport("@material/tabs/tab/foundation", "MDCTabFoundation.cssClasses")
    @js.native
    val cssClasses: ACTIVE = js.native
    
    @JSImport("@material/tabs/tab/foundation", "MDCTabFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabAdapter = js.native
    
    @JSImport("@material/tabs/tab/foundation", "MDCTabFoundation.strings")
    @js.native
    val strings: SELECTEDEVENT = js.native
  }
}
