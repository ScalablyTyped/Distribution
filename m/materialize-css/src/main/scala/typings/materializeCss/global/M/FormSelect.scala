package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialFormSelectOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.FormSelect")
@js.native
class FormSelect ()
  extends typings.materializeCss.M.FormSelect
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
