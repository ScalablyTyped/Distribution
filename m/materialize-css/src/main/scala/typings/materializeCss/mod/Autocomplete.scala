package typings.materializeCss.mod

import typings.materializeCss.M.AutocompleteOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Autocomplete")
@js.native
class Autocomplete ()
  extends typings.materializeCss.M.Autocomplete

/* static members */
@JSImport("materialize-css", "Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Autocomplete] = js.native
  def init(els: MElements, options: Partial[AutocompleteOptions]): js.Array[typings.materializeCss.M.Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: Element): typings.materializeCss.M.Autocomplete = js.native
  def init(els: Element, options: Partial[AutocompleteOptions]): typings.materializeCss.M.Autocomplete = js.native
}

