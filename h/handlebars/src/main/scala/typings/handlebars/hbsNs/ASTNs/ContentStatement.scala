package typings.handlebars.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentStatement extends Node {
  var original: StripFlags
  var value: String
}

object ContentStatement {
  @scala.inline
  def apply(loc: SourceLocation, original: StripFlags, `type`: String, value: String): ContentStatement = {
    val __obj = js.Dynamic.literal(loc = loc, original = original, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContentStatement]
  }
}

