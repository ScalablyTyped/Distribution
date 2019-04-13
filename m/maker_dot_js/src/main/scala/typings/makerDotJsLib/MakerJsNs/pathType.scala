package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String-based enumeration of all paths types.
  *
  * Examples: use pathType instead of string literal when creating a circle.
  * ```
  * var circle: IPathCircle = { type: pathType.Circle, origin: [0, 0], radius: 7 };   //typescript
  * var circle = { type: pathType.Circle, origin: [0, 0], radius: 7 };   //javascript
  * ```
  */
@JSGlobal("MakerJs.pathType")
@js.native
object pathType extends js.Object {
  var Arc: java.lang.String = js.native
  var BezierSeed: java.lang.String = js.native
  var Circle: java.lang.String = js.native
  var Line: java.lang.String = js.native
}

