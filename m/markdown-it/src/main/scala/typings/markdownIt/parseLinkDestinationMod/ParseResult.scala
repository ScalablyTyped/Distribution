package typings.markdownIt.parseLinkDestinationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var lines: Double
  var ok: Boolean
  var pos: Double
  var str: String
}

object ParseResult {
  @scala.inline
  def apply(lines: Double, ok: Boolean, pos: Double, str: String): ParseResult = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
}

