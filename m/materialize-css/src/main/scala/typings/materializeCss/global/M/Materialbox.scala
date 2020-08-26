package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialMaterialboxOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Materialbox")
@js.native
class Materialbox ()
  extends typings.materializeCss.M.Materialbox

/* static members */
@JSGlobal("M.Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Materialbox] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialMaterialboxOptions
  ): js.Array[typings.materializeCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: Element): typings.materializeCss.M.Materialbox = js.native
  def init(els: Element, options: PartialMaterialboxOptions): typings.materializeCss.M.Materialbox = js.native
}

