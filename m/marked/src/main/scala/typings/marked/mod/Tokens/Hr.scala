package typings.marked.mod.Tokens

import typings.marked.markedStrings.hr
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hr extends Token {
  var raw: String
  var `type`: hr
}

object Hr {
  @scala.inline
  def apply(raw: String, `type`: hr): Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hr]
  }
}

