package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCorrectionLevel extends js.Object {
  val Bits: Double
  val Name: String
  var bits: Double
  var name: String
  var ordinal_Renamed_Field: Double
}

object ErrorCorrectionLevel {
  @scala.inline
  def apply(Bits: Double, Name: String, bits: Double, name: String, ordinal_Renamed_Field: Double): ErrorCorrectionLevel = {
    val __obj = js.Dynamic.literal(Bits = Bits.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ordinal_Renamed_Field = ordinal_Renamed_Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCorrectionLevel]
  }
}

