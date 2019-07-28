package typings.handlebars.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral extends Node {
  var original: Boolean
  var value: Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(loc: SourceLocation, original: Boolean, `type`: String, value: Boolean): BooleanLiteral = {
    val __obj = js.Dynamic.literal(loc = loc, original = original, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BooleanLiteral]
  }
}

