package typings.materializeCss.M

import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipsOptions extends js.Object {
  /**
    * Set autocomplete options
    * @default {}
    */
  var autocompleteOptions: Partial[AutocompleteOptions]
  /**
    * Set the chip data
    * @default []
    */
  var data: js.Array[ChipData]
  /**
    * Set chips limit
    * @default Infinity
    */
  var limit: Double
  /**
    * Set first placeholder when there are no tags
    * @default ''
    */
  var placeholder: String
  /**
    * Set second placeholder when adding additional tags
    * @default ''
    */
  var secondaryPlaceholder: String
  /**
    * Callback for chip add
    * @default null
    */
  def onChipAdd(element: Element, chip: Element): Unit
  /**
    * Callback for chip delete
    * @default null
    */
  def onChipDelete(element: Element, chip: Element): Unit
  /**
    * Callback for chip select
    * @default null
    */
  def onChipSelect(element: Element, chip: Element): Unit
}

object ChipsOptions {
  @scala.inline
  def apply(
    autocompleteOptions: Partial[AutocompleteOptions],
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
}

