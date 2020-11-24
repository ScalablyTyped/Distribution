package typings.materialChips

import typings.materialBase.componentMod.MDCComponent
import typings.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation
import typings.materialRipple.componentMod.MDCRipple
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/trailingaction/component", JSImport.Namespace)
@js.native
object trailingactionComponentMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @js.native
  class MDCChipTrailingAction () extends MDCComponent[MDCChipTrailingActionFoundation] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def focus(): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    def isNavigable(): Boolean = js.native
    
    def removeFocus(): Unit = js.native
    
    def ripple: MDCRipple = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  @js.native
  object MDCChipTrailingAction extends js.Object {
    
    def attachTo(root: Element): MDCChipTrailingAction = js.native
  }
  
  type MDCChipTrailingActionFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCChipTrailingActionFoundation], 
    MDCChipTrailingAction
  ]
}
