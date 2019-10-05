package typings.materializeDashCss.M

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
  def onChipAdd(`this`: Chips, element: Element, chip: Element): Unit
  /**
    * Callback for chip delete
    * @default null
    */
  def onChipDelete(`this`: Chips, element: Element, chip: Element): Unit
  /**
    * Callback for chip select
    * @default null
    */
  def onChipSelect(`this`: Chips, element: Element, chip: Element): Unit
}

object ChipsOptions {
  @scala.inline
  def apply(
    autocompleteOptions: Partial[AutocompleteOptions],
    data: js.Array[ChipData],
    limit: Double,
    onChipAdd: (Chips, Element, Element) => Unit,
    onChipDelete: (Chips, Element, Element) => Unit,
    onChipSelect: (Chips, Element, Element) => Unit,
    placeholder: String,
    secondaryPlaceholder: String
  ): ChipsOptions = {
    val __obj = js.Dynamic.literal(autocompleteOptions = autocompleteOptions, data = data, limit = limit, onChipAdd = js.Any.fromFunction3(onChipAdd), onChipDelete = js.Any.fromFunction3(onChipDelete), onChipSelect = js.Any.fromFunction3(onChipSelect), placeholder = placeholder, secondaryPlaceholder = secondaryPlaceholder)
  
    __obj.asInstanceOf[ChipsOptions]
  }
}

