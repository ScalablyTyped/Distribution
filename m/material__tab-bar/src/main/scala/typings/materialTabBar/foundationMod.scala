package typings.materialTabBar

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTab.typesMod.MDCTabInteractionEvent
import typings.materialTabBar.adapterMod.MDCTabBarAdapter
import typings.materialTabBar.anon.ARROWLEFTKEY
import typings.materialTabBar.anon.ARROWLEFTKEYCODE
import typings.materialTabBar.anon.PartialMDCTabBarAdapter
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-bar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCTabBarFoundation () extends MDCFoundation[MDCTabBarAdapter] {
    def this(adapter: PartialMDCTabBarAdapter) = this()
    def activateTab(index: Double): Unit = js.native
    def handleKeyDown(evt: KeyboardEvent): Unit = js.native
    /**
      * Handles the MDCTab:interacted event
      */
    def handleTabInteraction(evt: MDCTabInteractionEvent): Unit = js.native
    /**
      * Scrolls the tab at the given index into view
      * @param index The tab index to make visible
      */
    def scrollIntoView(index: Double): Unit = js.native
    /**
      * Switches between automatic and manual activation modes.
      * See https://www.w3.org/TR/wai-aria-practices/#tabpanel for examples.
      */
    def setUseAutomaticActivation(useAutomaticActivation: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    def defaultAdapter: MDCTabBarAdapter = js.native
    def numbers: ARROWLEFTKEYCODE = js.native
    def strings: ARROWLEFTKEY = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def defaultAdapter: MDCTabBarAdapter = js.native
    def numbers: ARROWLEFTKEYCODE = js.native
    def strings: ARROWLEFTKEY = js.native
  }
  
}

