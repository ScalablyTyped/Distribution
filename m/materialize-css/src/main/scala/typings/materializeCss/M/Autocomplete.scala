package typings.materializeCss.M

import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Autocomplete")
@js.native
class Autocomplete ()
  extends Component[AutocompleteOptions]
     with Openable {
  /**
    * Index of the current selected option.
    */
  var activeIndex: Double = js.native
  /**
    * Number of matching autocomplete options.
    */
  var count: Double = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
  /**
    * Select a specific autocomplete options.
    * @param el Element of the autocomplete option.
    */
  def selectOption(el: Element): Unit = js.native
  /**
    * Update autocomplete options data.
    * @param data Autocomplete options data object.
    */
  def updateData(data: AutocompleteData): Unit = js.native
}

/* static members */
@JSGlobal("M.Autocomplete")
@js.native
object Autocomplete extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Autocomplete = js.native
  /**
    * Init autocompletes
    */
  def init(els: MElements): js.Array[Autocomplete] = js.native
  def init(els: MElements, options: Partial[AutocompleteOptions]): js.Array[Autocomplete] = js.native
  /**
    * Init autocomplete
    */
  def init(els: Element): Autocomplete = js.native
  def init(els: Element, options: Partial[AutocompleteOptions]): Autocomplete = js.native
}

