package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var dash: js.UndefOr[js.Array[Double]] = js.native
  var lineCap: js.UndefOr[String] = js.native
  var points: js.Any = js.native
}

object LineConfig {
  @scala.inline
  def apply(points: js.Any): LineConfig = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineConfig]
  }
  @scala.inline
  implicit class LineConfigOps[Self <: LineConfig] (val x: Self) extends AnyVal {
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
    def setPoints(value: js.Any): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashVarargs(value: Double*): Self = this.set("dash", js.Array(value :_*))
    @scala.inline
    def setDash(value: js.Array[Double]): Self = this.set("dash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    @scala.inline
    def setLineCap(value: String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
  }
  
}

