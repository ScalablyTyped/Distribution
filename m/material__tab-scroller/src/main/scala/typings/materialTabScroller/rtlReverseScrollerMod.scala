package typings.materialTabScroller

import typings.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typings.materialTabScroller.rtlScrollerMod.MDCTabScrollerRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtlReverseScrollerMod {
  
  @JSImport("@material/tab-scroller/rtl-reverse-scroller", JSImport.Default)
  @js.native
  open class default protected () extends MDCTabScrollerRTLReverse {
    def this(adapter: MDCTabScrollerAdapter) = this()
  }
  
  @JSImport("@material/tab-scroller/rtl-reverse-scroller", "MDCTabScrollerRTLReverse")
  @js.native
  open class MDCTabScrollerRTLReverse protected () extends MDCTabScrollerRTL {
    def this(adapter: MDCTabScrollerAdapter) = this()
    
    /* private */ var calculateScrollEdges: Any = js.native
    
    /* private */ var clampScrollValue: Any = js.native
  }
}
