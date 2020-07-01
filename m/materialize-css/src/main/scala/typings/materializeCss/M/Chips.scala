package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ChipsOptions> * / any */ @js.native
trait Chips extends js.Object {
  /**
    * Autocomplete instance, if any
    */
  var autocomplete: Autocomplete = js.native
  /**
    * Array of the current chips data
    */
  var chipsData: js.Array[ChipData] = js.native
  /**
    * If the chips has autocomplete enabled
    */
  var hasAutocomplete: Boolean = js.native
  /**
    * Add chip to input
    * @param data Chip data object
    */
  def addChip(chip: ChipData): Unit = js.native
  /**
    * Delete nth chip
    * @param n  Index of chip
    */
  def deleteChip(): Unit = js.native
  def deleteChip(n: Double): Unit = js.native
  /**
    * Select nth chip
    * @param n Index of chip
    */
  def selectChip(n: Double): Unit = js.native
}

