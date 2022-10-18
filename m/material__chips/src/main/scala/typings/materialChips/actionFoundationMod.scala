package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.actionAdapterMod.MDCChipActionAdapter
import typings.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typings.materialChips.actionConstantsMod.MDCChipActionType
import typings.materialChips.anon.PartialMDCChipActionAdapt
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionFoundationMod {
  
  /* note: abstract class */ @JSImport("@material/chips/action/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipActionFoundation {
    def this(adapter: PartialMDCChipActionAdapt) = this()
  }
  
  /* note: abstract class */ @JSImport("@material/chips/action/foundation", "MDCChipActionFoundation")
  @js.native
  open class MDCChipActionFoundation () extends MDCFoundation[MDCChipActionAdapter] {
    def this(adapter: PartialMDCChipActionAdapt) = this()
    
    def actionType(): MDCChipActionType = js.native
    
    /* private */ var emitInteraction: Any = js.native
    
    /* private */ var emitNavigation: Any = js.native
    
    /* private */ var getTriggerFromKey: Any = js.native
    
    def handleClick(): Unit = js.native
    
    def handleKeydown(event: KeyboardEvent): Unit = js.native
    
    def isDisabled(): Boolean = js.native
    
    def isFocusable(): Boolean = js.native
    
    def isSelectable(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    def setDisabled(isDisabled: Boolean): Unit = js.native
    
    def setFocus(behavior: MDCChipActionFocusBehavior): Unit = js.native
    
    def setSelected(isSelected: Boolean): Unit = js.native
    
    /* protected */ def shouldEmitInteractionOnRemoveKey(): Boolean = js.native
    
    /* private */ var shouldNotifyInteractionFromKey: Any = js.native
  }
}
