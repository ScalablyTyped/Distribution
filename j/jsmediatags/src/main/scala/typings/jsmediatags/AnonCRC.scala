package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCRC extends js.Object {
  var CRC: Double
  var RESTRICTIONS: Double
  var UPDATE: Double
}

object AnonCRC {
  @scala.inline
  def apply(CRC: Double, RESTRICTIONS: Double, UPDATE: Double): AnonCRC = {
    val __obj = js.Dynamic.literal(CRC = CRC.asInstanceOf[js.Any], RESTRICTIONS = RESTRICTIONS.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCRC]
  }
}

