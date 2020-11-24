package typings.materializeCss.M

import typings.materializeCss.anon.PartialAutocompleteOptionData
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChipsOptions extends js.Object {
  
  /**
    * Set autocomplete options
    * @default {}
    */
  var autocompleteOptions: PartialAutocompleteOptionData = js.native
  
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
    autocompleteOptions: PartialAutocompleteOptionData,
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
  implicit class ChipsOptionsOps[Self <: ChipsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutocompleteOptions(value: PartialAutocompleteOptionData): Self = this.set("autocompleteOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: ChipData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ChipData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChipAdd(value: (Element, Element) => Unit): Self = this.set("onChipAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChipDelete(value: (Element, Element) => Unit): Self = this.set("onChipDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChipSelect(value: (Element, Element) => Unit): Self = this.set("onChipSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPlaceholder(value: String): Self = this.set("secondaryPlaceholder", value.asInstanceOf[js.Any])
  }
}
