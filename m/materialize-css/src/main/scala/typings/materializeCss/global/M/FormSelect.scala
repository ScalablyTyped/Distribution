package typings.materializeCss.global.M

import typings.materializeCss.M.FormSelectOptions
import typings.materializeCss.MElements
import typings.materializeCss.anon.PartialFormSelectOptions
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.FormSelect")
@js.native
class FormSelect ()
  extends typings.materializeCss.M.FormSelect {
  /**
    * Instance of the dropdown plugin for this select
    */
  /* CompleteClass */
  override var dropdown: typings.materializeCss.M.Dropdown = js.native
  /**
    * Dropdown UL element
    */
  /* CompleteClass */
  override var dropdownOptions: HTMLUListElement = js.native
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * Text input that shows current selected option
    */
  /* CompleteClass */
  override var input: HTMLInputElement = js.native
  /**
    * If this is a multiple select
    */
  /* CompleteClass */
  override var isMultiple: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: FormSelectOptions = js.native
  /**
    * The select wrapper element
    */
  /* CompleteClass */
  override var wrapper: Element = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Get selected values in an array
    */
  /* CompleteClass */
  override def getSelectedValues(): js.Array[String] = js.native
}

/* static members */
@JSGlobal("M.FormSelect")
@js.native
object FormSelect extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.FormSelect = js.native
  /**
    * Init FormSelects
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.FormSelect] = js.native
  def init(els: MElements, options: PartialFormSelectOptions): js.Array[typings.materializeCss.M.FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: Element): typings.materializeCss.M.FormSelect = js.native
  def init(els: Element, options: PartialFormSelectOptions): typings.materializeCss.M.FormSelect = js.native
}

