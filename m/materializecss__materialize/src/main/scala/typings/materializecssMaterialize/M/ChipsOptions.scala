package typings.materializecssMaterialize.M

import typings.materializecssMaterialize.anon.PartialAutocompleteOption
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChipsOptions extends StObject {
  
  /**
    * Toggles abililty to add custom value not in autocomplete list.
    * @default false
    */
  var autocompleteOnly: Boolean
  
  /**
    * Set autocomplete options.
    * @default {}
    */
  var autocompleteOptions: PartialAutocompleteOption
  
  /**
    * Set the chip data.
    * @default []
    */
  var data: js.Array[ChipData]
  
  /**
    * Set chips limit.
    * @default Infinity
    */
  var limit: Double
  
  /**
    * Callback for chip add.
    * @default null
    */
  def onChipAdd(element: Element, chip: Element): Unit
  
  /**
    * Callback for chip delete.
    * @default null
    */
  def onChipDelete(element: Element, chip: Element): Unit
  
  /**
    * Callback for chip select.
    * @default null
    */
  def onChipSelect(element: Element, chip: Element): Unit
  
  /**
    * Set first placeholder when there are no tags.
    * @default ""
    */
  var placeholder: String
  
  /**
    * Set second placeholder when adding additional tags.
    * @default ""
    */
  var secondaryPlaceholder: String
}
object ChipsOptions {
  
  inline def apply(
    autocompleteOnly: Boolean,
    autocompleteOptions: PartialAutocompleteOption,
    data: js.Array[ChipData],
    limit: Double,
    onChipAdd: (Element, Element) => Unit,
    onChipDelete: (Element, Element) => Unit,
    onChipSelect: (Element, Element) => Unit,
    placeholder: String,
    secondaryPlaceholder: String
  ): ChipsOptions = {
    val __obj = js.Dynamic.literal(autocompleteOnly = autocompleteOnly.asInstanceOf[js.Any], autocompleteOptions = autocompleteOptions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], onChipAdd = js.Any.fromFunction2(onChipAdd), onChipDelete = js.Any.fromFunction2(onChipDelete), onChipSelect = js.Any.fromFunction2(onChipSelect), placeholder = placeholder.asInstanceOf[js.Any], secondaryPlaceholder = secondaryPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChipsOptions] (val x: Self) extends AnyVal {
    
    inline def setAutocompleteOnly(value: Boolean): Self = StObject.set(x, "autocompleteOnly", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteOptions(value: PartialAutocompleteOption): Self = StObject.set(x, "autocompleteOptions", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[ChipData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: ChipData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOnChipAdd(value: (Element, Element) => Unit): Self = StObject.set(x, "onChipAdd", js.Any.fromFunction2(value))
    
    inline def setOnChipDelete(value: (Element, Element) => Unit): Self = StObject.set(x, "onChipDelete", js.Any.fromFunction2(value))
    
    inline def setOnChipSelect(value: (Element, Element) => Unit): Self = StObject.set(x, "onChipSelect", js.Any.fromFunction2(value))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPlaceholder(value: String): Self = StObject.set(x, "secondaryPlaceholder", value.asInstanceOf[js.Any])
  }
}
