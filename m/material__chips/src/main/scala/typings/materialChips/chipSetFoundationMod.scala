package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.actionConstantsMod.MDCChipActionType
import typings.materialChips.anon.PartialMDCChipSetAdapter
import typings.materialChips.chipSetAdapterMod.MDCChipSetAdapter
import typings.materialChips.chipSetTypesMod.ChipAnimationEvent
import typings.materialChips.chipSetTypesMod.ChipInteractionEvent
import typings.materialChips.chipSetTypesMod.ChipNavigationEvent
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetFoundationMod {
  
  @JSImport("@material/chips/chip-set/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  @JSImport("@material/chips/chip-set/foundation", "MDCChipSetFoundation")
  @js.native
  open class MDCChipSetFoundation () extends MDCFoundation[MDCChipSetAdapter] {
    def this(adapter: PartialMDCChipSetAdapter) = this()
    
    def addChip(index: Double): Unit = js.native
    
    /* private */ var focusChip: Any = js.native
    
    /**
      * Find the first focusable action by moving bidirectionally horizontally
      * from the start index.
      *
      * Given chip set [A, B, C, D, E, F, G]...
      * Let's say we remove chip "F". We don't know where the nearest focusable
      * action is since any of them could be disabled. The nearest focusable
      * action could be E, it could be G, it could even be A. To find it, we
      * start from the source index (5 for "F" in this case) and move out
      * horizontally, checking each chip at each index.
      *
      */
    /* private */ var focusNearestFocusableAction: Any = js.native
    
    /**
      * Increments to find the first focusable chip.
      */
    /* private */ var focusNextChipFrom: Any = js.native
    
    /**
      * Decrements to find the first focusable chip. Takes an optional target
      * action that can be used to focus the first matching focusable action.
      */
    /* private */ var focusPrevChipFrom: Any = js.native
    
    /**
      * Returs the first focusable action, regardless of type, or null if no
      * focusable actions exist.
      */
    /* private */ var getFirstFocusableAction: Any = js.native
    
    /** Returns the appropriate focusable action, or null if none exist. */
    /* private */ var getFocusableAction: Any = js.native
    
    /**
      * If the actions contain a focusable action that matches the target action,
      * return that. Otherwise, return the first focusable action, or null if no
      * focusable action exists.
      */
    /* private */ var getMatchingFocusableAction: Any = js.native
    
    /* private */ var getNearestFocusableAction: Any = js.native
    
    /** Returns the unique selected indexes of the chips. */
    def getSelectedChipIndexes(): ReadonlySet[Double] = js.native
    
    def handleChipAnimation(hasDetail: ChipAnimationEvent): Unit = js.native
    
    def handleChipInteraction(hasDetail: ChipInteractionEvent): Unit = js.native
    
    def handleChipNavigation(hasDetail: ChipNavigationEvent): Unit = js.native
    
    /** Returns the selected state of the chip at the given index and action. */
    def isChipSelected(index: Double, action: MDCChipActionType): Boolean = js.native
    
    /* private */ var removeAfterAnimation: Any = js.native
    
    /** Removes the chip at the given index. */
    def removeChip(index: Double): Unit = js.native
    
    /** Sets the selected state of the chip at the given index and action. */
    def setChipSelected(index: Double, action: MDCChipActionType, isSelected: Boolean): Unit = js.native
    
    /* private */ var setSelection: Any = js.native
    
    /* private */ var supportsMultiSelect: Any = js.native
  }
}
