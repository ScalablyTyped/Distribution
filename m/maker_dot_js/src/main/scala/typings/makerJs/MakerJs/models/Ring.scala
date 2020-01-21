package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Ring")
@js.native
class Ring protected () extends IModel {
  def this(outerRadius: Double, innerRadius: Double) = this()
  @JSName("paths")
  var paths_Ring: IPathMap = js.native
}

