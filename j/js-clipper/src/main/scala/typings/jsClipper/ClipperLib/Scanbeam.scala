package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scanbeam extends js.Object {
  var Y: Double = js.native
  var next: TEdge = js.native
}

object Scanbeam {
  @scala.inline
  def apply(Y: Double, next: TEdge): Scanbeam = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanbeam]
  }
  @scala.inline
  implicit class ScanbeamOps[Self <: Scanbeam] (val x: Self) extends AnyVal {
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
    def setNext(value: TEdge): Self = this.set("next", value.asInstanceOf[js.Any])
  }
  
}

