package typings
package atMaterialLinearDashProgressLib.atMaterialLinearDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/linear-progress", "MDCLinearProgress")
@js.native
class MDCLinearProgress ()
  extends atMaterialBaseLib.atMaterialBaseMod.MDCComponent[
      atMaterialLinearDashProgressLib.adapterMod.MDCLinearProgressAdapter, 
      atMaterialLinearDashProgressLib.foundationMod.default
    ] {
  var buffer: scala.Double = js.native
  var determinate: scala.Boolean = js.native
  var progress: scala.Double = js.native
  var reverse: scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def open(): scala.Unit = js.native
}

@JSImport("@material/linear-progress", "MDCLinearProgress")
@js.native
object MDCLinearProgress extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialLinearDashProgressLib.atMaterialLinearDashProgressMod.MDCLinearProgress = js.native
}

