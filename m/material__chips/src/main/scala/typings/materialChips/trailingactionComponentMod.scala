package typings.materialChips

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialChips.trailingactionFoundationMod.MDCChipTrailingActionFoundation
import typings.materialRipple.componentMod.MDCRipple
import typings.materialRipple.componentMod.MDCRippleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingactionComponentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/chips/deprecated/trailingaction/component", "MDCChipTrailingAction")
  @js.native
  open class MDCChipTrailingAction protected () extends MDCComponent[MDCChipTrailingActionFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCChipTrailingActionFoundation, args: Any*) = this()
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def focus(): Unit = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ var handleKeydown: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    def isNavigable(): Boolean = js.native
    
    def removeFocus(): Unit = js.native
    
    def ripple: MDCRipple = js.native
    
    /* private */ var rippleSurface: Any = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCChipTrailingAction {
    
    @JSImport("@material/chips/deprecated/trailingaction/component", "MDCChipTrailingAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCChipTrailingAction = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCChipTrailingAction]
  }
  
  type MDCChipTrailingActionFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCChipTrailingActionFoundation], 
    MDCChipTrailingAction
  ]
}
