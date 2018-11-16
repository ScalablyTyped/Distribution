package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Autocomplete")
@js.native
class Autocomplete () extends Component[AutocompleteOptions] {
  /**
           * Index of the current selected option.
           */
  var activeIndex: scala.Double = js.native
  /**
           * Number of matching autocomplete options.
           */
  var count: scala.Double = js.native
  /**
           * If the autocomplete is open.
           */
  var isOpen: scala.Boolean = js.native
  /**
           * Select a specific autocomplete options.
           * @param el Element of the autocomplete option.
           */
  def selectOption(el: stdLib.Element): scala.Unit = js.native
  /**
           * Update autocomplete options data.
           * @param data Autocomplete options data object.
           */
  def updateData(data: AutocompleteData): scala.Unit = js.native
}

@JSGlobal("M.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
           * Get Instance
           */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Autocomplete = js.native
  /**
           * Init autocompletes
           */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Autocomplete] = js.native
  /**
           * Init autocompletes
           */
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.AutocompleteOptions]
  ): js.Array[materializeDashCssLib.MNs.Autocomplete] = js.native
  /**
           * Init autocomplete
           */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Autocomplete = js.native
  /**
           * Init autocomplete
           */
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.AutocompleteOptions]): materializeDashCssLib.MNs.Autocomplete = js.native
}

