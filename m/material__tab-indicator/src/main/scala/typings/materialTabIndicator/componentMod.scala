package typings.materialTabIndicator

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation
import typings.std.ClientRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-indicator/component", "MDCTabIndicator")
  @js.native
  class MDCTabIndicator protected () extends MDCComponent[MDCTabIndicatorFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabIndicatorFoundation, args: js.Any*) = this()
    
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    
    def computeContentClientRect(): ClientRect = js.native
    
    def deactivate(): Unit = js.native
    
    def initialize(): Unit = js.native
  }
  /* static members */
  object MDCTabIndicator {
    
    @JSImport("@material/tab-indicator/component", "MDCTabIndicator")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCTabIndicator = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabIndicator]
  }
  
  type MDCTabIndicatorFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTabIndicatorFoundation], 
    MDCTabIndicator
  ]
}
