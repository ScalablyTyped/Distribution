package typings.materialChips

import typings.materialBase.componentMod.MDCComponent
import typings.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation
import typings.materialRipple.componentMod.MDCRipple
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingactionComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/chips/trailingaction/component", "MDCChipTrailingAction")
  @js.native
  class MDCChipTrailingAction protected () extends MDCComponent[MDCChipTrailingActionFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCChipTrailingActionFoundation, args: js.Any*) = this()
    
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
  object MDCChipTrailingAction {
    
    @JSImport("@material/chips/trailingaction/component", "MDCChipTrailingAction")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCChipTrailingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCChipTrailingAction]
  }
  
  type MDCChipTrailingActionFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCChipTrailingActionFoundation], 
    MDCChipTrailingAction
  ]
}
