package typings.marked.mod.Tokens

import typings.marked.markedStrings.html
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML extends Token {
  var pre: Boolean
  var raw: String
  var text: String
  var `type`: html
}

object HTML {
  @scala.inline
  def apply(pre: Boolean, raw: String, text: String, `type`: html): HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
}

