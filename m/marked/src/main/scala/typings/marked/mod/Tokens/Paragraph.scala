package typings.marked.mod.Tokens

import typings.marked.markedStrings.paragraph
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph extends Token {
  var pre: js.UndefOr[Boolean] = js.undefined
  var raw: String
  var text: String
  var `type`: paragraph
}

object Paragraph {
  @scala.inline
  def apply(raw: String, text: String, `type`: paragraph, pre: js.UndefOr[Boolean] = js.undefined): Paragraph = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
}

