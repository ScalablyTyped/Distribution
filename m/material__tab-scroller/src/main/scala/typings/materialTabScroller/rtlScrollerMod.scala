package typings.materialTabScroller

import typings.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typings.materialTabScroller.typesMod.MDCTabScrollerAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tab-scroller/rtl-scroller", JSImport.Namespace)
@js.native
object rtlScrollerMod extends js.Object {
  
  @js.native
  abstract class MDCTabScrollerRTL protected () extends js.Object {
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
  
  @js.native
  abstract class default protected () extends MDCTabScrollerRTL {
    def this(adapter: MDCTabScrollerAdapter) = this()
  }
}
