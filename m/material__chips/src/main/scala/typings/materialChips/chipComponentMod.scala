package typings.materialChips

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialChips.actionComponentMod.MDCChipActionFactory
import typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typings.materialChips.actionConstantsMod.MDCChipActionType
import typings.materialChips.chipConstantsMod.MDCChipAnimation
import typings.materialChips.chipFoundationMod.MDCChipFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipComponentMod {
  
  @JSImport("@material/chips/chip/component", "MDCChip")
  @js.native
  open class MDCChip protected () extends MDCComponent[MDCChipFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCChipFoundation, args: Any*) = this()
    
    /* private */ var actions: Any = js.native
    
    /** Returns the MDCChipActionTypes for the encapsulated actions. */
    def getActions(): js.Array[MDCChipActionType] = js.native
    
    /** Returns the ID of the root element. */
    def getElementID(): String = js.native
    
    /* private */ var handleActionInteraction: Any = js.native
    
    /* private */ var handleActionNavigation: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(actionFactory: MDCChipActionFactory): Unit = js.native
    
    /** Returns the focusability of the action. */
    def isActionFocusable(action: MDCChipActionType): Boolean = js.native
    
    /** Returns the selectability of the action. */
    def isActionSelectable(action: MDCChipActionType): Boolean = js.native
    
    /** Returns the selected state of the action. */
    def isActionSelected(action: MDCChipActionType): Boolean = js.native
    
    def isDisabled(): Boolean = js.native
    
    /** Exposed to be called by the parent chip set. */
    def remove(): Unit = js.native
    
    /* private */ val rootHTML: Any = js.native
    
    /** Sets the focus behavior of the action. */
    def setActionFocus(action: MDCChipActionType, focus: MDCChipActionFocusBehavior): Unit = js.native
    
    /** Sets the selected state of the action. */
    def setActionSelected(action: MDCChipActionType, isSelected: Boolean): Unit = js.native
    
    def setDisabled(isDisabled: Boolean): Unit = js.native
    
    /** Starts the animation on the chip. */
    def startAnimation(animation: MDCChipAnimation): Unit = js.native
  }
  /* static members */
  object MDCChip {
    
    @JSImport("@material/chips/chip/component", "MDCChip")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCChip = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCChip]
  }
  
  type MDCChipFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCChipFoundation], 
    MDCChip
  ]
}
