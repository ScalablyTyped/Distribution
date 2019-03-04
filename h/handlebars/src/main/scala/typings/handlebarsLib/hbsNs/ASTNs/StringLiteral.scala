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
    val __obj = js.Dynamic.literal(loc = loc, original = original, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringLiteral]
  }
}

