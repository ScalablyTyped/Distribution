package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipsOptions extends js.Object {
  /**
    * Set autocomplete options
    * @default {}
    */
  var autocompleteOptions: stdLib.Partial[AutocompleteOptions]
  /**
    * Set the chip data
    * @default []
    */
  var data: js.Array[ChipData]
  /**
    * Set chips limit
    * @default Infinity
    */
  var limit: scala.Double
  /**
    * Set first placeholder when there are no tags
    * @default ''
    */
  var placeholder: java.lang.String
  /**
    * Set second placeholder when adding additional tags
    * @default ''
    */
  var secondaryPlaceholder: java.lang.String
  /**
    * Callback for chip add
    * @default null
    */
  def onChipAdd(`this`: Chips, element: stdLib.Element, chip: stdLib.Element): scala.Unit
  /**
    * Callback for chip delete
    * @default null
    */
  def onChipDelete(`this`: Chips, element: stdLib.Element, chip: stdLib.Element): scala.Unit
  /**
    * Callback for chip select
    * @default null
    */
  def onChipSelect(`this`: Chips, element: stdLib.Element, chip: stdLib.Element): scala.Unit
}

