package typings.makerJs.global.MakerJs.models

import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Slot")
@js.native
class Slot protected ()
  extends typings.makerJs.MakerJs.models.Slot {
  def this(origin: IPoint, endPoint: IPoint, radius: Double) = this()
  def this(origin: IPoint, endPoint: IPoint, radius: Double, isolateCaps: Boolean) = this()
  /* CompleteClass */
  @JSName("models")
  override var models_Slot: IModelMap = js.native
  /* CompleteClass */
  @JSName("origin")
  override var origin_Slot: IPoint = js.native
  /* CompleteClass */
  @JSName("paths")
  override var paths_Slot: IPathMap = js.native
}

