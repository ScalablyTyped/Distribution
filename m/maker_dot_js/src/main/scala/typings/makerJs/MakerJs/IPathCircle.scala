package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A circle path.
  *
  * Examples:
  * ```
  * var circle: IPathCircle = { type: 'circle', origin: [0, 0], radius: 7 };   //typescript
  * var circle = { type: 'circle', origin: [0, 0], radius: 7 };   //javascript
  * ```
  */
trait IPathCircle extends IPath {
  /**
    * The radius of the circle.
    */
  var radius: Double
}

object IPathCircle {
  @scala.inline
  def apply(origin: IPoint, radius: Double, `type`: String, layer: String = null): IPathCircle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathCircle]
  }
}

