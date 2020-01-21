package typings.makerJs.MakerJs

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
  var Arc: String = js.native
  var BezierSeed: String = js.native
  var Circle: String = js.native
  var Line: String = js.native
}

