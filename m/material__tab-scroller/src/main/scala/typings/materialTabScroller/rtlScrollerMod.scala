package typings.materialTabScroller

import typings.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typings.materialTabScroller.typesMod.MDCTabScrollerAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtlScrollerMod {
  
  @JSImport("@material/tab-scroller/rtl-scroller", JSImport.Default)
  @js.native
  abstract class default protected () extends MDCTabScrollerRTL {
    def this(adapter: MDCTabScrollerAdapter) = this()
  }
  
  @JSImport("@material/tab-scroller/rtl-scroller", "MDCTabScrollerRTL")
  @js.native
  abstract class MDCTabScrollerRTL protected () extends StObject {
    def this(adapter: MDCTabScrollerAdapter) = this()
    
    val adapter: MDCTabScrollerAdapter = js.native
    
    /**
      * @param scrollX The current scrollX position
      * @param translateX The current translateX position
      */
    def getAnimatingScrollPosition(scrollX: Double, translateX: Double): Double = js.native
    
    def getScrollPositionRTL(translateX: Double): Double = js.native
    
    def incrementScrollRTL(scrollX: Double): MDCTabScrollerAnimation = js.native
    
    def scrollToRTL(scrollX: Double): MDCTabScrollerAnimation = js.native
  }
}
