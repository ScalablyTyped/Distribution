package typings.makerDotJs.MakerJsNs.modelsNs

import typings.makerDotJs.MakerJsNs.IModel
import typings.makerDotJs.MakerJsNs.IModelMap
import typings.makerDotJs.MakerJsNs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.OvalArc")
@js.native
class OvalArc protected () extends IModel {
  def this(startAngle: Double, endAngle: Double, sweepRadius: Double, slotRadius: Double) = this()
  def this(
    startAngle: Double,
    endAngle: Double,
    sweepRadius: Double,
    slotRadius: Double,
    selfIntersect: Boolean
  ) = this()
  def this(
    startAngle: Double,
    endAngle: Double,
    sweepRadius: Double,
    slotRadius: Double,
    selfIntersect: Boolean,
    isolateCaps: Boolean
  ) = this()
  @JSName("models")
  var models_OvalArc: IModelMap = js.native
  @JSName("paths")
  var paths_OvalArc: IPathMap = js.native
}

