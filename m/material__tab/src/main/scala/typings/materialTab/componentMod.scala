package typings.materialTab

import typings.materialBase.componentMod.MDCComponent
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.materialTab.foundationMod.MDCTabFoundation
import typings.materialTab.typesMod.MDCTabDimensions
import typings.materialTabIndicator.componentMod.MDCTabIndicatorFactory
import typings.std.ClientRect
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tab/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @js.native
  class MDCTab () extends MDCComponent[MDCTabFoundation] {
    
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
  @js.native
  object MDCTab extends js.Object {
    
    def attachTo(root: Element): MDCTab = js.native
  }
  
  type MDCTabFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCTabFoundation], MDCTab]
}
