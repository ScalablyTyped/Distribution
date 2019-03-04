package typings
package markedLib.markedMod.markedNs.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends markedLib.markedMod.markedNs.Token {
  var text: java.lang.String
  var `type`: markedLib.markedLibStrings.text
}

object Text {
  @scala.inline
  def apply(text: java.lang.String, `type`: markedLib.markedLibStrings.text): Text = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Text]
  }
}

