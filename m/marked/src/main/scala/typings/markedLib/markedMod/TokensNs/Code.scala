package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code
  extends markedLib.markedMod.Token {
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var `type`: markedLib.markedLibStrings.code
}

object Code {
  @scala.inline
  def apply(text: java.lang.String, `type`: markedLib.markedLibStrings.code, lang: java.lang.String = null): Code = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Code]
  }
}

