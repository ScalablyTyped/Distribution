package typings
package luxonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Literal extends js.Object {
  var literal: scala.Boolean
  var `val`: java.lang.String
}

object Anon_Literal {
  @scala.inline
  def apply(literal: scala.Boolean, `val`: java.lang.String): Anon_Literal = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("literal")(literal)
    __obj.asInstanceOf[Anon_Literal]
  }
}

