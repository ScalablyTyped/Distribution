package typings.materializeDashCss.materializeDashCssMod

import typings.materializeDashCss.MElements
import typings.materializeDashCss.MNs.TapTargetOptions
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typings.materializeDashCss.MNs.TapTarget

/* static members */
@JSImport("materialize-css", "TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeDashCss.MNs.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: MElements): js.Array[typings.materializeDashCss.MNs.TapTarget] = js.native
  def init(els: MElements, options: Partial[TapTargetOptions]): js.Array[typings.materializeDashCss.MNs.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: Element): typings.materializeDashCss.MNs.TapTarget = js.native
  def init(els: Element, options: Partial[TapTargetOptions]): typings.materializeDashCss.MNs.TapTarget = js.native
}

