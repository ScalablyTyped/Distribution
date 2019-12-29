package typings.atMaterialTabDashScroller

import typings.atMaterialTabDashScroller.adapterMod.MDCTabScrollerAdapter
import typings.atMaterialTabDashScroller.typesMod.MDCTabScrollerAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-scroller/rtl-scroller", JSImport.Namespace)
@js.native
object rtlDashScrollerMod extends js.Object {
  @js.native
  abstract class MDCTabScrollerRTL protected () extends js.Object {
    def this(adapter: MDCTabScrollerAdapter) = this()
    val adapter_ : MDCTabScrollerAdapter = js.native
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

