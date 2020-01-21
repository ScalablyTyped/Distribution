package typings.luxon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLiteral extends js.Object {
  var literal: Boolean
  var `val`: String
}

object AnonLiteral {
  @scala.inline
  def apply(literal: Boolean, `val`: String): AnonLiteral = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLiteral]
  }
}

