package typings.marked.markedMod.TokensNs

import typings.marked.markedMod.Token
import typings.marked.markedStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends Token {
  var text: String
  var `type`: text
}

object Text {
  @scala.inline
  def apply(text: String, `type`: text): Text = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Text]
  }
}

