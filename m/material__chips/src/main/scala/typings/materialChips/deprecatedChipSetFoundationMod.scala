package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.anon.PartialMDCChipSetAdapterAnnounceMessage
import typings.materialChips.deprecatedChipSetAdapterMod.MDCChipSetAdapter
import typings.materialChips.deprecatedChipTypesMod.MDCChipInteractionEventDetail
import typings.materialChips.deprecatedChipTypesMod.MDCChipNavigationEventDetail
import typings.materialChips.deprecatedChipTypesMod.MDCChipRemovalEventDetail
import typings.materialChips.deprecatedChipTypesMod.MDCChipSelectionEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedChipSetFoundationMod {
  
  @JSImport("@material/chips/deprecated/chip-set/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapterAnnounceMessage) = this()
  }
  
  @JSImport("@material/chips/deprecated/chip-set/foundation", "MDCChipSetFoundation")
  @js.native
  open class MDCChipSetFoundation () extends MDCFoundation[MDCChipSetAdapter] {
    def this(adapter: PartialMDCChipSetAdapterAnnounceMessage) = this()
    
    /**
      * Deselects the chip with the given id and notifies clients.
      */
    /* private */ var deselectAndNotifyClients: Any = js.native
    
    /**
      * Deselects the chip with the given id and optionally notifies clients.
      */
    /* private */ var deselectImpl: Any = js.native
    
    /* private */ var focusChipAction: Any = js.native
    
    /* private */ var getDirection: Any = js.native
    
    /**
      * Returns an array of the IDs of all selected chips.
      */
    def getSelectedChipIds(): js.Array[String] = js.native
    
    /**
      * Handles a chip interaction event
      */
    def handleChipInteraction(hasChipId: MDCChipInteractionEventDetail): Unit = js.native
    
    /**
      * Handles a chip navigation event.
      */
    def handleChipNavigation(hasChipIdKeySource: MDCChipNavigationEventDetail): Unit = js.native
    
    /**
      * Handles the event when a chip is removed.
      */
    def handleChipRemoval(hasChipIdRemovedAnnouncement: MDCChipRemovalEventDetail): Unit = js.native
    
    /**
      * Handles a chip selection event, used to handle discrepancy when selection state is set directly on the Chip.
      */
    def handleChipSelection(hasChipIdSelectedShouldIgnore: MDCChipSelectionEventDetail): Unit = js.native
    
    /* private */ var removeFocusFromChipsExcept: Any = js.native
    
    /**
      * Selects the chip with the given id. Deselects all other chips if the chip set is of the choice variant.
      * Does not notify clients of the updated selection state.
      */
    def select(chipId: String): Unit = js.native
    
    /* private */ var selectAndNotifyClients: Any = js.native
    
    /* private */ var selectImpl: Any = js.native
    
    /**
      * The ids of the selected chips in the set. Only used for choice chip set or filter chip set.
      */
    /* private */ var selectedChipIds: Any = js.native
    
    /**
      * Toggles selection of the chip with the given id.
      */
    /* private */ var toggleSelect: Any = js.native
  }
}
