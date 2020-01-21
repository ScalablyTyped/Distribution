package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Dogbone")
@js.native
class Dogbone protected () extends IModel {
  /**
    * Create a dogbone from width, height, corner radius, style, and bottomless flag.
    *
    * Example:
    * ```
    * var d = new makerjs.models.Dogbone(50, 100, 5);
    * ```
    *
    * @param width Width of the rectangle.
    * @param height Height of the rectangle.
    * @param radius Corner radius.
    * @param style Optional corner style: 0 (default) for dogbone, 1 for vertical, -1 for horizontal.
    * @param bottomless Optional flag to omit the bottom line and bottom corners (default false).
    */
  def this(width: Double, height: Double, radius: Double) = this()
  def this(width: Double, height: Double, radius: Double, style: Double) = this()
  def this(width: Double, height: Double, radius: Double, style: Double, bottomless: Boolean) = this()
  @JSName("paths")
  var paths_Dogbone: IPathMap = js.native
}

