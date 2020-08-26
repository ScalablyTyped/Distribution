package typings.materialTab

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTab.adapterMod.MDCTabAdapter
import typings.materialTab.anon.ACTIVE
import typings.materialTab.anon.ARIASELECTED
import typings.materialTab.anon.PartialMDCTabAdapter
import typings.materialTab.typesMod.MDCTabDimensions
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCTabFoundation () extends MDCFoundation[MDCTabAdapter] {
    def this(adapter: PartialMDCTabAdapter) = this()
    /**
      * Activates the Tab
      */
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    /**
      * Returns the dimensions of the Tab
      */
    def computeDimensions(): MDCTabDimensions = js.native
    /**
      * Deactivates the Tab
      */
    def deactivate(): Unit = js.native
    def handleClick(): Unit = js.native
    def isActive(): Boolean = js.native
    /**
      * Sets whether the tab should focus itself when activated
      */
    def setFocusOnActivate(focusOnActivate: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabFoundation {
    def this(adapter: PartialMDCTabAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    def cssClasses: ACTIVE = js.native
    def defaultAdapter: MDCTabAdapter = js.native
    def strings: ARIASELECTED = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: ACTIVE = js.native
    def defaultAdapter: MDCTabAdapter = js.native
    def strings: ARIASELECTED = js.native
  }
  
}

