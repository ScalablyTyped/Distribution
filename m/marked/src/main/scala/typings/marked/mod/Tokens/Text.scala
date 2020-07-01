package typings.marked.mod.Tokens

import typings.marked.markedStrings.text
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends Token {
  var raw: String
  var text: String
  var `type`: text
}

object Text {
  @scala.inline
  def apply(raw: String, text: String, `type`: text): Text = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

