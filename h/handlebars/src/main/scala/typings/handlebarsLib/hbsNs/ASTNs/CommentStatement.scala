package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentStatement extends Node {
  var strip: StripFlags
  var value: java.lang.String
}

object CommentStatement {
  @scala.inline
  def apply(loc: SourceLocation, strip: StripFlags, `type`: java.lang.String, value: java.lang.String): CommentStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("strip")(strip)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CommentStatement]
  }
}

