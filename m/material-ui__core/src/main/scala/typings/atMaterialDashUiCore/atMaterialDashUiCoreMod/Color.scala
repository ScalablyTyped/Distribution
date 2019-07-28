package typings.atMaterialDashUiCore.atMaterialDashUiCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var `100`: String
  var `200`: String
  var `300`: String
  var `400`: String
  var `50`: String
  var `500`: String
  var `600`: String
  var `700`: String
  var `800`: String
  var `900`: String
  var A100: String
  var A200: String
  var A400: String
  var A700: String
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
    val __obj = js.Dynamic.literal(A100 = A100, A200 = A200, A400 = A400, A700 = A700)
    __obj.updateDynamic("100")(`100`)
    __obj.updateDynamic("200")(`200`)
    __obj.updateDynamic("300")(`300`)
    __obj.updateDynamic("400")(`400`)
    __obj.updateDynamic("50")(`50`)
    __obj.updateDynamic("500")(`500`)
    __obj.updateDynamic("600")(`600`)
    __obj.updateDynamic("700")(`700`)
    __obj.updateDynamic("800")(`800`)
    __obj.updateDynamic("900")(`900`)
    __obj.asInstanceOf[Color]
  }
}

