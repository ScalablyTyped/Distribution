package typings.materialTabBar

import typings.materialBase.componentMod.MDCComponent
import typings.materialTab.componentMod.MDCTabFactory
import typings.materialTabBar.foundationMod.MDCTabBarFoundation
import typings.materialTabScroller.componentMod.MDCTabScrollerFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-bar/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCTabBar () extends MDCComponent[MDCTabBarFoundation] {
    /**
      * Activates the tab at the given index
      * @param index The index of the tab
      */
    def activateTab(index: Double): Unit = js.native
    def focusOnActivate_=(focusOnActivate: Boolean): Unit = js.native
    def initialize(): Unit = js.native
    def initialize(tabFactory: js.UndefOr[scala.Nothing], tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory, tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    /**
      * Scrolls the tab at the given index into view
      * @param index THe index of the tab
      */
    def scrollIntoView(index: Double): Unit = js.native
    def useAutomaticActivation_=(useAutomaticActivation: Boolean): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: Element): MDCTabBar = js.native
  }
  
}

