package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chips
  extends StObject
     with Component[ChipsOptions] {
  
  /**
    * Add chip to input.
    * @param chip Chip data object
    */
  def addChip(chip: ChipData): Unit
  
  /**
    * Autocomplete instance, if any.
    */
  var autocomplete: Autocomplete
  
  /**
    * Array of the current chips data.
    */
  var chipsData: js.Array[ChipData]
  
  /**
    * Delete nth chip.
    * @param n  Index of chip
    */
  def deleteChip(n: Double): Unit
  
  /**
    * If the chips has autocomplete enabled.
    */
  var hasAutocomplete: Boolean
  
  /**
    * Select nth chip.
    * @param n Index of chip
    */
  def selectChip(n: Double): Unit
}
object Chips {
  
  inline def apply(
    addChip: ChipData => Unit,
    autocomplete: Autocomplete,
    chipsData: js.Array[ChipData],
    deleteChip: Double => Unit,
    destroy: () => Unit,
    el: Element,
    hasAutocomplete: Boolean,
    options: ChipsOptions,
    selectChip: Double => Unit
  ): Chips = {
    val __obj = js.Dynamic.literal(addChip = js.Any.fromFunction1(addChip), autocomplete = autocomplete.asInstanceOf[js.Any], chipsData = chipsData.asInstanceOf[js.Any], deleteChip = js.Any.fromFunction1(deleteChip), destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], hasAutocomplete = hasAutocomplete.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectChip = js.Any.fromFunction1(selectChip))
    __obj.asInstanceOf[Chips]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chips] (val x: Self) extends AnyVal {
    
    inline def setAddChip(value: ChipData => Unit): Self = StObject.set(x, "addChip", js.Any.fromFunction1(value))
    
    inline def setAutocomplete(value: Autocomplete): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setChipsData(value: js.Array[ChipData]): Self = StObject.set(x, "chipsData", value.asInstanceOf[js.Any])
    
    inline def setChipsDataVarargs(value: ChipData*): Self = StObject.set(x, "chipsData", js.Array(value*))
    
    inline def setDeleteChip(value: Double => Unit): Self = StObject.set(x, "deleteChip", js.Any.fromFunction1(value))
    
    inline def setHasAutocomplete(value: Boolean): Self = StObject.set(x, "hasAutocomplete", value.asInstanceOf[js.Any])
    
    inline def setSelectChip(value: Double => Unit): Self = StObject.set(x, "selectChip", js.Any.fromFunction1(value))
  }
}
