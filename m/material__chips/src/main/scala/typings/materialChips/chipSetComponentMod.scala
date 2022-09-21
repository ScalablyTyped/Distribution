package typings.materialChips

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialChips.chipComponentMod.MDCChipFactory
import typings.materialChips.chipSetFoundationMod.MDCChipSetFoundation
import typings.materialChips.constantsMod.MDCChipActionType
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetComponentMod {
  
  @JSImport("@material/chips/chip-set/component", "MDCChipSet")
  @js.native
  open class MDCChipSet protected () extends MDCComponent[MDCChipSetFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCChipSetFoundation, args: Any*) = this()
    
    /** Animates the chip addition at the given index. */
    def addChip(index: Double): Unit = js.native
    
    /* private */ var chips: Any = js.native
    
    /**
      * Returns the ID of the chip at the given index or an empty string if the
      * index is out of bounds.
      */
    def getChipIdAtIndex(index: Double): String = js.native
    
    /** Returns the index of the chip with the given ID or -1 if none exists. */
    def getChipIndexByID(chipID: String): Double = js.native
    
    /** Returns the unique indexes of the selected chips. */
    def getSelectedChipIndexes(): ReadonlySet[Double] = js.native
    
    /* private */ var handleChipAnimation: Any = js.native
    
    /* private */ var handleChipInteraction: Any = js.native
    
    /* private */ var handleChipNavigation: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(chipFactory: MDCChipFactory): Unit = js.native
    
    /** Returns the selection state of the chip. */
    def isChipSelected(index: Double, action: MDCChipActionType): Boolean = js.native
    
    /* private */ var isIndexValid: Any = js.native
    
    /** Removes the chip at the given index. */
    def removeChip(index: Double): Unit = js.native
    
    /** Sets the selection state of the chip. */
    def setChipSelected(index: Double, action: MDCChipActionType, isSelected: Boolean): Unit = js.native
  }
  /* static members */
  object MDCChipSet {
    
    @JSImport("@material/chips/chip-set/component", "MDCChipSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCChipSet = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCChipSet]
  }
}
