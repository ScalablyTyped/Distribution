package typings.materialTabIndicator

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-indicator/component", "MDCTabIndicator")
  @js.native
  open class MDCTabIndicator protected () extends MDCComponent[MDCTabIndicatorFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTabIndicatorFoundation, args: Any*) = this()
    
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: DOMRect): Unit = js.native
    
    def computeContentClientRect(): DOMRect = js.native
    
    /* private */ var content: Any = js.native
    
    def deactivate(): Unit = js.native
    
    def initialize(): Unit = js.native
  }
  /* static members */
  object MDCTabIndicator {
    
    @JSImport("@material/tab-indicator/component", "MDCTabIndicator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTabIndicator = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabIndicator]
  }
  
  type MDCTabIndicatorFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCTabIndicatorFoundation], 
    MDCTabIndicator
  ]
}
