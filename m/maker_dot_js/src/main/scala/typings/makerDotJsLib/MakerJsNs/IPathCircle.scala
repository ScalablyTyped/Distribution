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

