package typings.makerDotJs.MakerJs.models

import typings.makerDotJs.MakerJs.IModel
import typings.makerDotJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Dome")
@js.native
class Dome protected () extends IModel {
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, radius: Double) = this()
  @JSName("paths")
  var paths_Dome: IPathMap = js.native
}

