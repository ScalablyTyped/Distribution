package typings
package makerDotJsLib.MakerJsNs

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
  var radius: scala.Double
}

object IPathCircle {
  @scala.inline
  def apply(origin: IPoint, radius: scala.Double, `type`: java.lang.String, layer: java.lang.String = null): IPathCircle = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("radius")(radius)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPathCircle]
  }
}

