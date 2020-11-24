package typings.materializeCss.mod

import typings.materializeCss.anon.PartialDatepickerOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typings.materializeCss.M.Datepicker
/* static members */
@JSImport("materialize-css", "Datepicker")
@js.native
object Datepicker extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Datepicker = js.native
  
  /**
    * Init Datepickers
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Datepicker] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialDatepickerOptions
  ): js.Array[typings.materializeCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): typings.materializeCss.M.Datepicker = js.native
  def init(els: Element, options: PartialDatepickerOptions): typings.materializeCss.M.Datepicker = js.native
}
