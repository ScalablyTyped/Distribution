package typings.materialUiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

