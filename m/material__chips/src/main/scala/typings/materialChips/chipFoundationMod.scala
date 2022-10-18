package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typings.materialChips.actionConstantsMod.MDCChipActionType
import typings.materialChips.anon.PartialMDCChipAdapter
import typings.materialChips.chipAdapterMod.MDCChipAdapter
import typings.materialChips.chipConstantsMod.MDCChipAnimation
import typings.materialChips.chipTypesMod.ActionInteractionEvent
import typings.materialChips.chipTypesMod.ActionNavigationEvent
import typings.std.AnimationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipFoundationMod {
  
  @JSImport("@material/chips/chip/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipFoundation {
    def this(adapter: PartialMDCChipAdapter) = this()
  }
  
  @JSImport("@material/chips/chip/foundation", "MDCChipFoundation")
  @js.native
  open class MDCChipFoundation () extends MDCFoundation[MDCChipAdapter] {
    def this(adapter: PartialMDCChipAdapter) = this()
    
    /* private */ val animFrame: Any = js.native
    
    /* private */ var animateSelection: Any = js.native
    
    /* private */ var directionFromKey: Any = js.native
    
    def getActions(): js.Array[MDCChipActionType] = js.native
    
    /* private */ var getAddedAnnouncement: Any = js.native
    
    def getElementID(): String = js.native
    
    /* private */ var getRemovedAnnouncement: Any = js.native
    
    def handleActionInteraction(hasDetail: ActionInteractionEvent): Unit = js.native
    
    def handleActionNavigation(hasDetail: ActionNavigationEvent): Unit = js.native
    
    def handleAnimationEnd(event: AnimationEvent): Unit = js.native
    
    def handleTransitionEnd(): Unit = js.native
    
    def isActionFocusable(action: MDCChipActionType): Boolean = js.native
    
    def isActionSelectable(action: MDCChipActionType): Boolean = js.native
    
    def isActionSelected(action: MDCChipActionType): Boolean = js.native
    
    def isDisabled(): Boolean = js.native
    
    /* private */ var navigateActions: Any = js.native
    
    /* private */ var resetAnimationStyles: Any = js.native
    
    def setActionFocus(action: MDCChipActionType, focus: MDCChipActionFocusBehavior): Unit = js.native
    
    def setActionSelected(action: MDCChipActionType, isSelected: Boolean): Unit = js.native
    
    def setDisabled(isDisabled: Boolean): Unit = js.native
    
    /* private */ var shouldRemove: Any = js.native
    
    def startAnimation(animation: MDCChipAnimation): Unit = js.native
    
    /* private */ var updateSelectionStyles: Any = js.native
  }
}
