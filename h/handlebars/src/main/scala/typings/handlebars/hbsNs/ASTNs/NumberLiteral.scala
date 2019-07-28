package typings.handlebars.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLiteral extends Node {
  var original: Double
  var value: Double
}

object NumberLiteral {
  @scala.inline
  def apply(loc: SourceLocation, original: Double, `type`: String, value: Double): NumberLiteral = {
    val __obj = js.Dynamic.literal(loc = loc, original = original, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumberLiteral]
  }
}

