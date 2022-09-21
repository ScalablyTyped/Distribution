package typings.materialTabScroller

import typings.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typings.materialTabScroller.rtlScrollerMod.MDCTabScrollerRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtlNegativeScrollerMod {
  
  @JSImport("@material/tab-scroller/rtl-negative-scroller", JSImport.Default)
  @js.native
  open class default protected () extends MDCTabScrollerRTLNegative {
    def this(adapter: MDCTabScrollerAdapter) = this()
  }
  
  @JSImport("@material/tab-scroller/rtl-negative-scroller", "MDCTabScrollerRTLNegative")
  @js.native
  open class MDCTabScrollerRTLNegative protected () extends MDCTabScrollerRTL {
    def this(adapter: MDCTabScrollerAdapter) = this()
    
    /* private */ var calculateScrollEdges: Any = js.native
    
    /* private */ var clampScrollValue: Any = js.native
  }
}
