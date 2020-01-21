package typings.marked.mod.Tokens

import typings.marked.markedStrings.paragraph
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph extends Token {
  var pre: js.UndefOr[Boolean] = js.undefined
  var text: String
  var `type`: paragraph
}

object Paragraph {
  @scala.inline
  def apply(text: String, `type`: paragraph, pre: js.UndefOr[Boolean] = js.undefined): Paragraph = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
}

