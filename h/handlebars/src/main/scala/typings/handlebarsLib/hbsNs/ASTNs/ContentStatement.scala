package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentStatement extends Node {
  var original: StripFlags
  var value: java.lang.String
}

object ContentStatement {
  @scala.inline
  def apply(loc: SourceLocation, original: StripFlags, `type`: java.lang.String, value: java.lang.String): ContentStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ContentStatement]
  }
}

