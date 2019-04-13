package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph
  extends markedLib.markedMod.Token {
  var pre: js.UndefOr[scala.Boolean] = js.undefined
  var text: java.lang.String
  var `type`: markedLib.markedLibStrings.paragraph
}

object Paragraph {
  @scala.inline
  def apply(
    text: java.lang.String,
    `type`: markedLib.markedLibStrings.paragraph,
    pre: js.UndefOr[scala.Boolean] = js.undefined
  ): Paragraph = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre)
    __obj.asInstanceOf[Paragraph]
  }
}

