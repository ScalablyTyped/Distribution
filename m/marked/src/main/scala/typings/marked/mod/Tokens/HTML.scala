package typings.marked.mod.Tokens

import typings.marked.markedStrings.html
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML extends Token {
  var pre: Boolean
  var text: String
  var `type`: html
}

object HTML {
  @scala.inline
  def apply(pre: Boolean, text: String, `type`: html): HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
}

