package typings.materialToolbar

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialToolbar.adapterMod.MDCToolbarAdapter
import typings.materialToolbar.anon.CHANGEEVENT
import typings.materialToolbar.anon.FIXED
import typings.materialToolbar.anon.MAXTITLESIZE
import typings.materialToolbar.anon.PartialMDCToolbarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/toolbar/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCToolbarFoundation {
    def this(adapter: PartialMDCToolbarAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/toolbar/foundation", "default.cssClasses")
    @js.native
    val cssClasses: FIXED = js.native
    
    @JSImport("@material/toolbar/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    @JSImport("@material/toolbar/foundation", "default.numbers")
    @js.native
    val numbers: MAXTITLESIZE = js.native
    
    @JSImport("@material/toolbar/foundation", "default.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  @JSImport("@material/toolbar/foundation", "MDCToolbarFoundation")
  @js.native
  open class MDCToolbarFoundation () extends MDCFoundation[MDCToolbarAdapter] {
    def this(adapter: PartialMDCToolbarAdapter) = this()
    
    def updateAdjustElementStyles(): Unit = js.native
  }
  /* static members */
  object MDCToolbarFoundation {
    
    @JSImport("@material/toolbar/foundation", "MDCToolbarFoundation.cssClasses")
    @js.native
    val cssClasses: FIXED = js.native
    
    @JSImport("@material/toolbar/foundation", "MDCToolbarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    
    @JSImport("@material/toolbar/foundation", "MDCToolbarFoundation.numbers")
    @js.native
    val numbers: MAXTITLESIZE = js.native
    
    @JSImport("@material/toolbar/foundation", "MDCToolbarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
}
