package typings.marked.markedMod.TokensNs

import typings.marked.markedMod.Token
import typings.marked.markedStrings.html
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
    val __obj = js.Dynamic.literal(pre = pre, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HTML]
  }
}

