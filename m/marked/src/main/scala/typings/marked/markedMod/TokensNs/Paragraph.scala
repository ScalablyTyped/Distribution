package typings.marked.markedMod.TokensNs

import typings.marked.markedMod.Token
import typings.marked.markedStrings.paragraph
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
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre)
    __obj.asInstanceOf[Paragraph]
  }
}

