package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.M.FormSelectOptions
import typings.materializeDashCss.MElements
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "FormSelect")
@js.native
class FormSelect ()
  extends typings.materializeDashCss.M.FormSelect

/* static members */
@JSImport("materialize-css", "FormSelect")
@js.native
object FormSelect extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.M.FormSelect = js.native
  /**
    * Init FormSelects
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.M.FormSelect] = js.native
  def init(els: MElements, options: Partial[FormSelectOptions]): js.Array[typings.materializeDashCss.M.FormSelect] = js.native
  /**
    * Init FormSelect
    */
  def init(els: Element): typings.materializeDashCss.M.FormSelect = js.native
  def init(els: Element, options: Partial[FormSelectOptions]): typings.materializeDashCss.M.FormSelect = js.native
}

