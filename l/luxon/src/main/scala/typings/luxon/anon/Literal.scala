package typings.luxon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal extends js.Object {
  var literal: Boolean
  var `val`: String
}

object Literal {
  @scala.inline
  def apply(literal: Boolean, `val`: String): Literal = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

