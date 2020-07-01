package typings.marked.mod.Tokens

import typings.marked.markedStrings.space
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Space extends Token {
  var raw: String
  var `type`: space
}

object Space {
  @scala.inline
  def apply(raw: String, `type`: space): Space = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Space]
  }
}

