package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialTapTargetOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typings.materializeCss.M.TapTarget

/* static members */
@JSImport("materialize-css", "TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.TapTarget] = js.native
  def init(els: MElements, options: PartialTapTargetOptions): js.Array[typings.materializeCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: Element): typings.materializeCss.M.TapTarget = js.native
  def init(els: Element, options: PartialTapTargetOptions): typings.materializeCss.M.TapTarget = js.native
}

