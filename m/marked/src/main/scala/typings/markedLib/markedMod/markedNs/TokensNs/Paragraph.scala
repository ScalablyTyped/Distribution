package typings
package markedLib.markedMod.markedNs.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paragraph
  extends markedLib.markedMod.markedNs.Token {
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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("text")(text)
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre)
    __obj.asInstanceOf[Paragraph]
  }
}

