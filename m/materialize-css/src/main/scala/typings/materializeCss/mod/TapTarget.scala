package typings.materializeCss.mod

import typings.materializeCss.M.TapTargetOptions
import typings.materializeCss.MElements
import typings.std.Element
import typings.std.Partial
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
  def init(els: MElements, options: Partial[TapTargetOptions]): js.Array[typings.materializeCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: Element): typings.materializeCss.M.TapTarget = js.native
  def init(els: Element, options: Partial[TapTargetOptions]): typings.materializeCss.M.TapTarget = js.native
}

