package typings.jdenticon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  /**
    * Specifies the lightness range of colored shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var color: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Specifies the lightness range of grayscale shapes of an icon. The range is expressed as an array
    * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
    */
  var grayscale: js.UndefOr[js.Array[Double]] = js.native
}

object Color {
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: js.Array[Double]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setGrayscaleVarargs(value: Double*): Self = this.set("grayscale", js.Array(value :_*))
    @scala.inline
    def setGrayscale(value: js.Array[Double]): Self = this.set("grayscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrayscale: Self = this.set("grayscale", js.undefined)
  }
  
}

