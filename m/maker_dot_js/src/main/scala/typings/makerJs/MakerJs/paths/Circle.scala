package typings.makerJs.MakerJs.paths

import typings.makerJs.MakerJs.IPathCircle
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class for circle path.
  */
@js.native
trait Circle extends IPathCircle
object Circle {
  
  @scala.inline
  def apply(origin: IPoint, radius: Double, `type`: String): Circle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}
