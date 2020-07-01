package typings.materializeCss.mod

import typings.materializeCss.anon.PartialFormSelectOptions
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FormSelect")
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
    * The select wrapper element
    */
  /* CompleteClass */
  override var wrapper: Element = js.native
  /**
    * Get selected values in an array
    */
  /* CompleteClass */
  override def getSelectedValues(): js.Array[String] = js.native
}

/* static members */
@JSImport("materialize-css", "FormSelect")
@js.native
object FormSelect extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.FormSelect = js.native
  /**
    * Init FormSelects
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.FormSelect] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialFormSelectOptions
  ): js.Array[typings.materializeCss.M.FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: Element): typings.materializeCss.M.FormSelect = js.native
  def init(els: Element, options: PartialFormSelectOptions): typings.materializeCss.M.FormSelect = js.native
}

