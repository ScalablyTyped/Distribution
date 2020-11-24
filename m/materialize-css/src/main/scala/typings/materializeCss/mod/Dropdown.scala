package typings.materializeCss.mod

import typings.materializeCss.anon.PartialDropdownOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Dropdown")
@js.native
class Dropdown ()
  extends typings.materializeCss.M.Dropdown
/* static members */
@JSImport("materialize-css", "Dropdown")
@js.native
object Dropdown extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Dropdown = js.native
  
  /**
    * Init Dropdowns
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Dropdown] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialDropdownOptions
  ): js.Array[typings.materializeCss.M.Dropdown] = js.native
  /**
    * Init Dropdown
    */
  def init(els: Element): typings.materializeCss.M.Dropdown = js.native
  def init(els: Element, options: PartialDropdownOptions): typings.materializeCss.M.Dropdown = js.native
}
