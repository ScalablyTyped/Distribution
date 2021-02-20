package typings.materialTab

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.materialTab.foundationMod.MDCTabFoundation
import typings.materialTab.typesMod.MDCTabDimensions
import typings.materialTabIndicator.componentMod.MDCTabIndicatorFactory
import typings.std.ClientRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/tab/component", "MDCTab")
  @js.native
  class MDCTab protected () extends MDCComponent[MDCTabFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabFoundation, args: js.Any*) = this()
    
    /**
      * Activates the tab
      */
    def activate(): Unit = js.native
    def activate(computeIndicatorClientRect: ClientRect): Unit = js.native
    
    /**
      * Getter for the active state of the tab
      */
    def active: Boolean = js.native
    
    def computeDimensions(): MDCTabDimensions = js.native
    
    /**
      * Returns the indicator's client rect
      */
    def computeIndicatorClientRect(): ClientRect = js.native
    
    /**
      * Deactivates the tab
      */
    def deactivate(): Unit = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Focuses the tab
      */
    def focus(): Unit = js.native
    
    def focusOnActivate_=(focusOnActivate: Boolean): Unit = js.native
    
    var id: String = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: js.UndefOr[scala.Nothing], tabIndicatorFactory: MDCTabIndicatorFactory): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory, tabIndicatorFactory: MDCTabIndicatorFactory): Unit = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tab/component", "MDCTab.attachTo")
    @js.native
    def attachTo(root: Element): MDCTab = js.native
  }
  
  type MDCTabFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCTabFoundation], MDCTab]
}
