package typings
package makerDotJsLib.MakerJsNs

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
  def apply(end: IPoint, origin: IPoint, `type`: java.lang.String, layer: java.lang.String = null): IPathLine = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("origin")(origin)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPathLine]
  }
}

