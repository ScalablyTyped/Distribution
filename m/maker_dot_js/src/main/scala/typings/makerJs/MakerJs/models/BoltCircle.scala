package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.BoltCircle")
@js.native
class BoltCircle protected () extends IModel {
  def this(boltRadius: Double, holeRadius: Double, boltCount: Double) = this()
  def this(boltRadius: Double, holeRadius: Double, boltCount: Double, firstBoltAngleInDegrees: Double) = this()
  @JSName("paths")
  var paths_BoltCircle: IPathMap = js.native
}

