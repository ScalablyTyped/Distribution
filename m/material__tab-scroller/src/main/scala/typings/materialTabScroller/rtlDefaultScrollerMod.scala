package typings.materialTabScroller

import typings.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typings.materialTabScroller.rtlScrollerMod.MDCTabScrollerRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtlDefaultScrollerMod {
  
  @JSImport("@material/tab-scroller/rtl-default-scroller", JSImport.Default)
  @js.native
  open class default protected () extends MDCTabScrollerRTLDefault {
    def this(adapter: MDCTabScrollerAdapter) = this()
  }
  
  @JSImport("@material/tab-scroller/rtl-default-scroller", "MDCTabScrollerRTLDefault")
  @js.native
  open class MDCTabScrollerRTLDefault protected () extends MDCTabScrollerRTL {
    def this(adapter: MDCTabScrollerAdapter) = this()
    
    /* private */ var calculateScrollEdges: Any = js.native
    
    /* private */ var clampScrollValue: Any = js.native
    
    def getAnimatingScrollPosition(scrollX: Double): Double = js.native
    
    def getScrollPositionRTL(): Double = js.native
  }
}
