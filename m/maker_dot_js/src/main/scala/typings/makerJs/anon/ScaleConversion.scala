package typings.makerJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleConversion extends js.Object {
  var scaleConversion: Double = js.native
  var svgUnitType: String = js.native
}

object ScaleConversion {
  @scala.inline
  def apply(scaleConversion: Double, svgUnitType: String): ScaleConversion = {
    val __obj = js.Dynamic.literal(scaleConversion = scaleConversion.asInstanceOf[js.Any], svgUnitType = svgUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleConversion]
  }
  @scala.inline
  implicit class ScaleConversionOps[Self <: ScaleConversion] (val x: Self) extends AnyVal {
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
    def setScaleConversion(value: Double): Self = this.set("scaleConversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgUnitType(value: String): Self = this.set("svgUnitType", value.asInstanceOf[js.Any])
  }
  
}

