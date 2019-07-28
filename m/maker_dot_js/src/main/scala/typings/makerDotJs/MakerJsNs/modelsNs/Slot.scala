package typings.makerDotJs.MakerJsNs.modelsNs

import typings.makerDotJs.MakerJsNs.IModel
import typings.makerDotJs.MakerJsNs.IModelMap
import typings.makerDotJs.MakerJsNs.IPathMap
import typings.makerDotJs.MakerJsNs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Slot")
@js.native
class Slot protected () extends IModel {
  def this(origin: IPoint, endPoint: IPoint, radius: Double) = this()
  def this(origin: IPoint, endPoint: IPoint, radius: Double, isolateCaps: Boolean) = this()
  @JSName("models")
  var models_Slot: IModelMap = js.native
  @JSName("origin")
  var origin_Slot: IPoint = js.native
  @JSName("paths")
  var paths_Slot: IPathMap = js.native
}

