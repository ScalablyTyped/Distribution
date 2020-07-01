package typings.materializeCss.global.M

import typings.materializeCss.M.AutocompleteData
import typings.materializeCss.anon.PartialAutocompleteOption
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Autocomplete")
@js.native
class Autocomplete ()
  extends typings.materializeCss.M.Autocomplete {
  /**
    * Index of the current selected option.
    */
  /* CompleteClass */
  override var activeIndex: Double = js.native
  /**
    * Number of matching autocomplete options.
    */
  /* CompleteClass */
  override var count: Double = js.native
  /**
    * If the autocomplete is open.
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * Hide autocomplete.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Show autocomplete.
    */
  /* CompleteClass */
  override def open(): Unit = js.native
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  /* CompleteClass */
  override def selectOption(el: Element): Unit = js.native
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  /* CompleteClass */
  override def updateData(data: AutocompleteData): Unit = js.native
}

/* static members */
@JSGlobal("M.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Autocomplete] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialAutocompleteOption
  ): js.Array[typings.materializeCss.M.Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: Element): typings.materializeCss.M.Autocomplete = js.native
  def init(els: Element, options: PartialAutocompleteOption): typings.materializeCss.M.Autocomplete = js.native
}

