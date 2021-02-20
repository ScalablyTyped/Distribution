package typings.materialChips

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialChips.adapterMod.MDCChipSetAdapter
import typings.materialChips.anon.PartialMDCChipSetAdapter
import typings.materialChips.typesMod.MDCChipInteractionEventDetail
import typings.materialChips.typesMod.MDCChipNavigationEventDetail
import typings.materialChips.typesMod.MDCChipRemovalEventDetail
import typings.materialChips.typesMod.MDCChipSelectionEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/chips/chip-set/foundation", JSImport.Default)
  @js.native
  class default () extends MDCChipSetFoundation {
    def this(adapter: PartialMDCChipSetAdapter) = this()
  }
  
  @JSImport("@material/chips/chip-set/foundation", "MDCChipSetFoundation")
  @js.native
  class MDCChipSetFoundation () extends MDCFoundation[MDCChipSetAdapter] {
    def this(adapter: PartialMDCChipSetAdapter) = this()
    
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
    
    /**
      * Selects the chip with the given id. Deselects all other chips if the chip set is of the choice variant.
      * Does not notify clients of the updated selection state.
      */
    def select(chipId: String): Unit = js.native
  }
}
