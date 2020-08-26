package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cx extends js.Object {
  var cx: Double = js.native
  var cy: Double = js.native
  var fill: String = js.native
  var r: Double = js.native
  var transform: String = js.native
  var viewBox: String = js.native
}

object Cx {
  @scala.inline
  def apply(cx: Double, cy: Double, fill: String, r: Double, transform: String, viewBox: String): Cx = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cx]
  }
  @scala.inline
  implicit class CxOps[Self <: Cx] (val x: Self) extends AnyVal {
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
  }
  
}

