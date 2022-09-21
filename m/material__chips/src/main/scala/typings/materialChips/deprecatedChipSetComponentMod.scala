package typings.materialChips

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialChips.deprecatedChipComponentMod.MDCChip
import typings.materialChips.deprecatedChipComponentMod.MDCChipFactory
import typings.materialChips.deprecatedChipSetFoundationMod.MDCChipSetFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedChipSetComponentMod {
  
  @JSImport("@material/chips/deprecated/chip-set/component", "MDCChipSet")
  @js.native
  open class MDCChipSet protected () extends MDCComponent[MDCChipSetFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCChipSetFoundation, args: Any*) = this()
    
    /**
      * Adds a new chip object to the chip set from the given chip element.
      */
    def addChip(chipEl: typings.std.Element): Unit = js.native
    
    /* private */ var chipFactory: Any = js.native
    
    def chips: js.Array[MDCChip] = js.native
    
    /* private */ var chipsList: Any = js.native
    
    /**
      * Returns the index of the chip with the given id, or -1 if the chip does not exist.
      */
    /* private */ var findChipIndex: Any = js.native
    
    /* private */ var handleChipInteraction: Any = js.native
    
    /* private */ var handleChipNavigation: Any = js.native
    
    /* private */ var handleChipRemoval: Any = js.native
    
    /* private */ var handleChipSelection: Any = js.native
    
    /**
      * @param chipFactory A function which creates a new MDCChip.
      */
    def initialize(): Unit = js.native
    def initialize(chipFactory: MDCChipFactory): Unit = js.native
    
    /**
      * Instantiates chip components on all of the chip set's child chip elements.
      */
    /* private */ var instantiateChips: Any = js.native
    
    /**
      * @return An array of the IDs of all selected chips.
      */
    def selectedChipIds: js.Array[String] = js.native
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips/deprecated/chip-set/component", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCChipSet]
  }
}
