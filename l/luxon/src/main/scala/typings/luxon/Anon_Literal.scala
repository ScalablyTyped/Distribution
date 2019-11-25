package typings.luxon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Literal extends js.Object {
  var literal: Boolean
  var `val`: String
}

object Anon_Literal {
  @scala.inline
  def apply(literal: Boolean, `val`: String): Anon_Literal = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Literal]
  }
}

