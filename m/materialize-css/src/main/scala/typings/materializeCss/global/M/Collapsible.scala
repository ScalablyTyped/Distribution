package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialCollapsibleOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Collapsible")
@js.native
class Collapsible ()
  extends typings.materializeCss.M.Collapsible

/* static members */
@JSGlobal("M.Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Collapsible] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialCollapsibleOptions
  ): js.Array[typings.materializeCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): typings.materializeCss.M.Collapsible = js.native
  def init(els: Element, options: PartialCollapsibleOptions): typings.materializeCss.M.Collapsible = js.native
}

