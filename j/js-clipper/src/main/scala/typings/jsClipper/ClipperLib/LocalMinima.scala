package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalMinima extends js.Object {
  var Y: Double = js.native
  var leftBound: TEdge = js.native
  var next: TEdge = js.native
  var rightBound: TEdge = js.native
}

object LocalMinima {
  @scala.inline
  def apply(Y: Double, leftBound: TEdge, next: TEdge, rightBound: TEdge): LocalMinima = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], leftBound = leftBound.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], rightBound = rightBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalMinima]
  }
  @scala.inline
  implicit class LocalMinimaOps[Self <: LocalMinima] (val x: Self) extends AnyVal {
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
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBound(value: TEdge): Self = this.set("leftBound", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: TEdge): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBound(value: TEdge): Self = this.set("rightBound", value.asInstanceOf[js.Any])
  }
  
}

