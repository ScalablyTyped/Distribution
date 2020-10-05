package typings.materialUiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends js.Object {
  var `100`: String = js.native
  var `200`: String = js.native
  var `300`: String = js.native
  var `400`: String = js.native
  var `50`: String = js.native
  var `500`: String = js.native
  var `600`: String = js.native
  var `700`: String = js.native
  var `800`: String = js.native
  var `900`: String = js.native
  var A100: String = js.native
  var A200: String = js.native
  var A400: String = js.native
  var A700: String = js.native
}

object Color {
  @scala.inline
  def apply(
    `100`: String,
    `200`: String,
    `300`: String,
    `400`: String,
    `50`: String,
    `500`: String,
    `600`: String,
    `700`: String,
    `800`: String,
    `900`: String,
    A100: String,
    A200: String,
    A400: String,
    A700: String
  ): Color = {
    val __obj = js.Dynamic.literal(A100 = A100.asInstanceOf[js.Any], A200 = A200.asInstanceOf[js.Any], A400 = A400.asInstanceOf[js.Any], A700 = A700.asInstanceOf[js.Any])
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("600")(`600`.asInstanceOf[js.Any])
    __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
    __obj.updateDynamic("800")(`800`.asInstanceOf[js.Any])
    __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
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
    def set100(value: String): Self = this.set("100", value.asInstanceOf[js.Any])
    @scala.inline
    def set200(value: String): Self = this.set("200", value.asInstanceOf[js.Any])
    @scala.inline
    def set300(value: String): Self = this.set("300", value.asInstanceOf[js.Any])
    @scala.inline
    def set400(value: String): Self = this.set("400", value.asInstanceOf[js.Any])
    @scala.inline
    def set50(value: String): Self = this.set("50", value.asInstanceOf[js.Any])
    @scala.inline
    def set500(value: String): Self = this.set("500", value.asInstanceOf[js.Any])
    @scala.inline
    def set600(value: String): Self = this.set("600", value.asInstanceOf[js.Any])
    @scala.inline
    def set700(value: String): Self = this.set("700", value.asInstanceOf[js.Any])
    @scala.inline
    def set800(value: String): Self = this.set("800", value.asInstanceOf[js.Any])
    @scala.inline
    def set900(value: String): Self = this.set("900", value.asInstanceOf[js.Any])
    @scala.inline
    def setA100(value: String): Self = this.set("A100", value.asInstanceOf[js.Any])
    @scala.inline
    def setA200(value: String): Self = this.set("A200", value.asInstanceOf[js.Any])
    @scala.inline
    def setA400(value: String): Self = this.set("A400", value.asInstanceOf[js.Any])
    @scala.inline
    def setA700(value: String): Self = this.set("A700", value.asInstanceOf[js.Any])
  }
  
}

