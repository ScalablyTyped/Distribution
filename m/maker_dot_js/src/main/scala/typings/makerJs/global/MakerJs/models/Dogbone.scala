package typings.makerJs.global.MakerJs.models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.Dogbone")
@js.native
class Dogbone protected ()
  extends typings.makerJs.MakerJs.models.Dogbone {
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
  def this(
    width: Double,
    height: Double,
    radius: Double,
    style: js.UndefOr[scala.Nothing],
    bottomless: Boolean
  ) = this()
  def this(width: Double, height: Double, radius: Double, style: Double, bottomless: Boolean) = this()
}
