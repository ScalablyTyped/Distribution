package typings.atMaterialTabDashBar

import typings.atMaterialBase.componentMod.MDCComponent
import typings.atMaterialBase.foundationMod.default
import typings.atMaterialTabDashBar.componentMod.MDCTabBar
import typings.atMaterialTabDashBar.foundationMod.MDCTabBarFoundation
import typings.atMaterialTabDashScroller.componentMod.MDCTabScrollerFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-bar/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCTabBar () extends MDCComponent[MDCTabBarFoundation, default[MDCTabBarFoundation]] {
    var focusOnActivate: Boolean = js.native
    var useAutomaticActivation: Boolean = js.native
    /**
      * Activates the tab at the given index
      * @param index The index of the tab
      */
    def activateTab(index: Double): Unit = js.native
    def initialize(): Unit = js.native
    def initialize(
      tabFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MDCTabFactory */ js.Any
    ): Unit = js.native
    def initialize(
      tabFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MDCTabFactory */ js.Any,
      tabScrollerFactory: MDCTabScrollerFactory
    ): Unit = js.native
    /**
      * Scrolls the tab at the given index into view
      * @param index THe index of the tab
      */
    def scrollIntoView(index: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: Element): MDCTabBar = js.native
  }
  
}

