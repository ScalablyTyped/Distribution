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

