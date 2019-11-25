package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A line path.
  *
  * Examples:
  * ```
  * var line: IPathLine = { type: 'line', origin: [0, 0], end: [1, 1] };   //typescript
  * var line = { type: 'line', origin: [0, 0], end: [1, 1] };   //javascript
  * ```
  */
trait IPathLine extends IPath {
  /**
    * The end point defining the line. The start point is the origin.
    */
  var end: IPoint
}

object IPathLine {
  @scala.inline
  def apply(end: IPoint, origin: IPoint, `type`: String, layer: String = null): IPathLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathLine]
  }
}

