package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialPushpinOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.Pushpin")
@js.native
class Pushpin ()
  extends typings.materializeCss.M.Pushpin
/* static members */
@JSGlobal("M.Pushpin")
@js.native
object Pushpin extends js.Object {
  
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Pushpin = js.native
  
  /**
    * Init Pushpins
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Pushpin] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialPushpinOptions
  ): js.Array[typings.materializeCss.M.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: Element): typings.materializeCss.M.Pushpin = js.native
  def init(els: Element, options: PartialPushpinOptions): typings.materializeCss.M.Pushpin = js.native
}
