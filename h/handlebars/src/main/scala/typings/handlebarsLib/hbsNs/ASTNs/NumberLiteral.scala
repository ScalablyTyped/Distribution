package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLiteral extends Node {
  var original: scala.Double
  var value: scala.Double
}

object NumberLiteral {
  @scala.inline
  def apply(loc: SourceLocation, original: scala.Double, `type`: java.lang.String, value: scala.Double): NumberLiteral = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NumberLiteral]
  }
}

