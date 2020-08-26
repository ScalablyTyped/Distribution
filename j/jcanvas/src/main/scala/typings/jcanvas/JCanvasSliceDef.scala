package typings.jcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JCanvasSliceDef extends js.Object {
  /**
    * End angle in degrees from north
    */
  var end: Double = js.native
  var fillStyle: String = js.native
  var groups: js.UndefOr[js.Array[String]] = js.native
  var layer: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * Radius in pixels
    */
  var radius: Double = js.native
  /**
    * Distance between slices as a fraction of the radius
    */
  var spread: js.UndefOr[Double] = js.native
  /**
    * Start angle in degrees from north
    */
  var start: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object JCanvasSliceDef {
  @scala.inline
  def apply(end: Double, fillStyle: String, radius: Double, start: Double, x: Double, y: Double): JCanvasSliceDef = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fillStyle = fillStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JCanvasSliceDef]
  }
  @scala.inline
  implicit class JCanvasSliceDefOps[Self <: JCanvasSliceDef] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillStyle(value: String): Self = this.set("fillStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setLayer(value: Boolean): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSpread(value: Double): Self = this.set("spread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
  }
  
}

