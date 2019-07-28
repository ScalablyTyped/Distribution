package typings.handlebars.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentStatement extends Node {
  var strip: StripFlags
  var value: String
}

object CommentStatement {
  @scala.inline
  def apply(loc: SourceLocation, strip: StripFlags, `type`: String, value: String): CommentStatement = {
    val __obj = js.Dynamic.literal(loc = loc, strip = strip, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommentStatement]
  }
}

