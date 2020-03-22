package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialFormSelectOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FormSelect")
@js.native
class FormSelect ()
  extends typings.materializeCss.M.FormSelect

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
  def init(els: MElements): js.Array[typings.materializeCss.M.FormSelect] = js.native
  def init(els: MElements, options: PartialFormSelectOptions): js.Array[typings.materializeCss.M.FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: Element): typings.materializeCss.M.FormSelect = js.native
  def init(els: Element, options: PartialFormSelectOptions): typings.materializeCss.M.FormSelect = js.native
}

