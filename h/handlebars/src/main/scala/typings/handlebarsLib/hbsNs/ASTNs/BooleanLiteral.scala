package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral extends Node {
  var original: scala.Boolean
  var value: scala.Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(loc: SourceLocation, original: scala.Boolean, `type`: java.lang.String, value: scala.Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BooleanLiteral]
  }
}

