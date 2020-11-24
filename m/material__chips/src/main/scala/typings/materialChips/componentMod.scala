package typings.materialChips

import typings.materialBase.componentMod.MDCComponent
import typings.materialChips.chipComponentMod.MDCChip
import typings.materialChips.chipComponentMod.MDCChipFactory
import typings.materialChips.foundationMod.MDCChipSetFoundation
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/chip-set/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCChipSet () extends MDCComponent[MDCChipSetFoundation] {
    
    /**
      * Adds a new chip object to the chip set from the given chip element.
      */
    def addChip(chipEl: Element): Unit = js.native
    
    def chips: js.Array[MDCChip] = js.native
    
    /**
      * @param chipFactory A function which creates a new MDCChip.
      */
    def initialize(): Unit = js.native
    def initialize(chipFactory: MDCChipFactory): Unit = js.native
    
    /**
      * @return An array of the IDs of all selected chips.
      */
    def selectedChipIds: js.Array[String] = js.native
  }
  /* static members */
  @js.native
  object MDCChipSet extends js.Object {
    
    def attachTo(root: Element): MDCChipSet = js.native
  }
}
