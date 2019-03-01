package typings
package makerDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Centimeter extends js.Object {
  var Centimeter: java.lang.String
  var Foot: java.lang.String
  var Inch: java.lang.String
  var Meter: java.lang.String
  var Millimeter: java.lang.String
}

object Anon_Centimeter {
  @scala.inline
  def apply(
    Centimeter: java.lang.String,
    Foot: java.lang.String,
    Inch: java.lang.String,
    Meter: java.lang.String,
    Millimeter: java.lang.String
  ): Anon_Centimeter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Centimeter")(Centimeter)
    __obj.updateDynamic("Foot")(Foot)
    __obj.updateDynamic("Inch")(Inch)
    __obj.updateDynamic("Meter")(Meter)
    __obj.updateDynamic("Millimeter")(Millimeter)
    __obj.asInstanceOf[Anon_Centimeter]
  }
}

