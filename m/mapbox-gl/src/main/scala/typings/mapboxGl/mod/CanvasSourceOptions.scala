package typings.mapboxGl.mod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasSourceOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var canvas: String | HTMLCanvasElement = js.native
  var coordinates: js.Array[js.Array[Double]] = js.native
}

object CanvasSourceOptions {
  @scala.inline
  def apply(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]]): CanvasSourceOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasSourceOptions]
  }
  @scala.inline
  implicit class CanvasSourceOptionsOps[Self <: CanvasSourceOptions] (val x: Self) extends AnyVal {
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
    def setCanvas(value: String | HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoordinatesVarargs(value: js.Array[Double]*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[js.Array[Double]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
  }
  
}

