package typings.marked.mod.Tokens

import typings.marked.markedStrings.escape
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Escape extends Token {
  var raw: String
  var text: String
  var `type`: escape
}

object Escape {
  @scala.inline
  def apply(raw: String, text: String, `type`: escape): Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Escape]
  }
}

