package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ChipsOptions> * / any */ @js.native
trait Chips extends StObject {
  
  /**
    * Add chip to input
    * @param data Chip data object
    */
  def addChip(chip: ChipData): Unit = js.native
  
  /**
    * Autocomplete instance, if any
    */
  var autocomplete: Autocomplete = js.native
  
  /**
    * Array of the current chips data
    */
  var chipsData: js.Array[ChipData] = js.native
  
  /**
    * Delete nth chip
    * @param n  Index of chip
    */
  def deleteChip(): Unit = js.native
  def deleteChip(n: Double): Unit = js.native
  
  /**
    * If the chips has autocomplete enabled
    */
  var hasAutocomplete: Boolean = js.native
  
  /**
    * Select nth chip
    * @param n Index of chip
    */
  def selectChip(n: Double): Unit = js.native
}
