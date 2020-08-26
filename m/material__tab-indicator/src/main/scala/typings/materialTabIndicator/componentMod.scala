package typings.materialTabIndicator

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation
import typings.std.ClientRect
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab-indicator/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCTabIndicator () extends MDCComponent[MDCTabIndicatorFoundation] {
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    def computeContentClientRect(): ClientRect = js.native
    def deactivate(): Unit = js.native
    def initialize(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabIndicator extends js.Object {
    def attachTo(root: Element): MDCTabIndicator = js.native
  }
  
  type MDCTabIndicatorFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTabIndicatorFoundation], 
    MDCTabIndicator
  ]
}

