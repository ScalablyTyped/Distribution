package typings.atMaterialLinearDashProgress.atMaterialLinearDashProgressMod

import typings.atMaterialBase.atMaterialBaseMod.MDCComponent
import typings.atMaterialLinearDashProgress.adapterMod.MDCLinearProgressAdapter
import typings.atMaterialLinearDashProgress.foundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/linear-progress", "MDCLinearProgress")
@js.native
class MDCLinearProgress () extends MDCComponent[MDCLinearProgressAdapter, default] {
  var buffer: Double = js.native
  var determinate: Boolean = js.native
  var progress: Double = js.native
  var reverse: Boolean = js.native
  def close(): Unit = js.native
  def open(): Unit = js.native
}

/* static members */
@JSImport("@material/linear-progress", "MDCLinearProgress")
@js.native
object MDCLinearProgress extends js.Object {
  def attachTo(root: Element): MDCLinearProgress = js.native
}

