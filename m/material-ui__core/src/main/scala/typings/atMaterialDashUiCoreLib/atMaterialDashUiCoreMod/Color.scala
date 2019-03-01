package typings
package atMaterialDashUiCoreLib.atMaterialDashUiCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var `100`: java.lang.String
  var `200`: java.lang.String
  var `300`: java.lang.String
  var `400`: java.lang.String
  var `50`: java.lang.String
  var `500`: java.lang.String
  var `600`: java.lang.String
  var `700`: java.lang.String
  var `800`: java.lang.String
  var `900`: java.lang.String
  var A100: java.lang.String
  var A200: java.lang.String
  var A400: java.lang.String
  var A700: java.lang.String
}

object Color {
  @scala.inline
  def apply(
    `100`: java.lang.String,
    `200`: java.lang.String,
    `300`: java.lang.String,
    `400`: java.lang.String,
    `50`: java.lang.String,
    `500`: java.lang.String,
    `600`: java.lang.String,
    `700`: java.lang.String,
    `800`: java.lang.String,
    `900`: java.lang.String,
    A100: java.lang.String,
    A200: java.lang.String,
    A400: java.lang.String,
    A700: java.lang.String
  ): Color = {
    val __obj = js.Dynamic.literal(`100` = `100`, `200` = `200`, `300` = `300`, `400` = `400`, `50` = `50`, `500` = `500`, `600` = `600`, `700` = `700`, `800` = `800`, `900` = `900`)
    __obj.updateDynamic("A100")(A100)
    __obj.updateDynamic("A200")(A200)
    __obj.updateDynamic("A400")(A400)
    __obj.updateDynamic("A700")(A700)
    __obj.asInstanceOf[Color]
  }
}

