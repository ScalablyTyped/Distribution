package typings.materializeCss.mod

import typings.materializeCss.anon.PartialTooltipOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typings.materializeCss.M.Tooltip
object Tooltip {
  
  /**
    * Get Instance
    */
  /* static member */
  @JSImport("materialize-css", "Tooltip.getInstance")
  @js.native
  def getInstance(elem: Element): typings.materializeCss.M.Tooltip = js.native
  
  /**
    * Init Tooltips
    */
  /* static member */
  @JSImport("materialize-css", "Tooltip.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Tooltip] = js.native
  @JSImport("materialize-css", "Tooltip.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTooltipOptions
  ): js.Array[typings.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  /* static member */
  @JSImport("materialize-css", "Tooltip.init")
  @js.native
  def init(els: Element): typings.materializeCss.M.Tooltip = js.native
  @JSImport("materialize-css", "Tooltip.init")
  @js.native
  def init(els: Element, options: PartialTooltipOptions): typings.materializeCss.M.Tooltip = js.native
}
