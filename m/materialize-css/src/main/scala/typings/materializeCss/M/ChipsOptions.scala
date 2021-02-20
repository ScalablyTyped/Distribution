package typings.materializeCss.M

import typings.materializeCss.anon.PartialAutocompleteOption
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChipsOptions extends StObject {
  
  /**
    * Set autocomplete options
    * @default {}
    */
  var autocompleteOptions: PartialAutocompleteOption = js.native
  
  /**
    * Set the chip data
    * @default []
    */
  var data: js.Array[ChipData] = js.native
  
  /**
    * Set chips limit
    * @default Infinity
    */
  var limit: Double = js.native
  
  /**
    * Callback for chip add
    * @default null
    */
  def onChipAdd(element: Element, chip: Element): Unit = js.native
  
  /**
    * Callback for chip delete
    * @default null
    */
  def onChipDelete(element: Element, chip: Element): Unit = js.native
  
  /**
    * Callback for chip select
    * @default null
    */
  def onChipSelect(element: Element, chip: Element): Unit = js.native
  
  /**
    * Set first placeholder when there are no tags
    * @default ''
    */
  var placeholder: String = js.native
  
  /**
    * Set second placeholder when adding additional tags
    * @default ''
    */
  var secondaryPlaceholder: String = js.native
}
object ChipsOptions {
  
  @scala.inline
  def apply(
    autocompleteOptions: PartialAutocompleteOption,
    data: js.Array[ChipData],
    limit: Double,
    onChipAdd: (Element, Element) => Unit,
    onChipDelete: (Element, Element) => Unit,
    onChipSelect: (Element, Element) => Unit,
    placeholder: String,
    secondaryPlaceholder: String
  ): ChipsOptions = {
    val __obj = js.Dynamic.literal(autocompleteOptions = autocompleteOptions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], onChipAdd = js.Any.fromFunction2(onChipAdd), onChipDelete = js.Any.fromFunction2(onChipDelete), onChipSelect = js.Any.fromFunction2(onChipSelect), placeholder = placeholder.asInstanceOf[js.Any], secondaryPlaceholder = secondaryPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipsOptions]
  }
  
  @scala.inline
  implicit class ChipsOptionsMutableBuilder[Self <: ChipsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocompleteOptions(value: PartialAutocompleteOption): Self = StObject.set(x, "autocompleteOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[ChipData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: ChipData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChipAdd(value: (Element, Element) => Unit): Self = StObject.set(x, "onChipAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChipDelete(value: (Element, Element) => Unit): Self = StObject.set(x, "onChipDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChipSelect(value: (Element, Element) => Unit): Self = StObject.set(x, "onChipSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPlaceholder(value: String): Self = StObject.set(x, "secondaryPlaceholder", value.asInstanceOf[js.Any])
  }
}
