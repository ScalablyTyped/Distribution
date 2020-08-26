package typings.makerJs.MakerJs

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
@js.native
trait IPathLine extends IPath {
  /**
    * The end point defining the line. The start point is the origin.
    */
  var end: IPoint = js.native
}

object IPathLine {
  @scala.inline
  def apply(end: IPoint, origin: IPoint, `type`: String): IPathLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathLine]
  }
  @scala.inline
  implicit class IPathLineOps[Self <: IPathLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: IPoint): Self = this.set("end", value.asInstanceOf[js.Any])
  }
  
}

