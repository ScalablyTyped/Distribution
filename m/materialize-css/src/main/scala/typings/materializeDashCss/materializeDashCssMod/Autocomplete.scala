package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.AutocompleteOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Autocomplete")
@js.native
class Autocomplete ()
  extends typings.materializeDashCss.MNs.Autocomplete

/* static members */
@JSImport("materialize-css", "Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.Autocomplete] = js.native
  def init(els: MElements, options: Partial[AutocompleteOptions]): js.Array[typings.materializeDashCss.MNs.Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: Element): typings.materializeDashCss.MNs.Autocomplete = js.native
  def init(els: Element, options: Partial[AutocompleteOptions]): typings.materializeDashCss.MNs.Autocomplete = js.native
}

