package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialTooltipOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Tooltip")
@js.native
class Tooltip ()
  extends typings.materializeCss.M.Tooltip
/* static members */
@JSGlobal("M.Tooltip")
@js.native
object Tooltip extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Tooltip = js.native
  
  /**
    * Init Tooltips
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Tooltip] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTooltipOptions
  ): js.Array[typings.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typings.materializeCss.M.Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): typings.materializeCss.M.Tooltip = js.native
}
