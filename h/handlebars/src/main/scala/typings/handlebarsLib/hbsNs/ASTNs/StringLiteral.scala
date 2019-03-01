package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral extends Node {
  var original: java.lang.String
  var value: java.lang.String
}

object StringLiteral {
  @scala.inline
  def apply(loc: SourceLocation, original: java.lang.String, `type`: java.lang.String, value: java.lang.String): StringLiteral = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StringLiteral]
  }
}

