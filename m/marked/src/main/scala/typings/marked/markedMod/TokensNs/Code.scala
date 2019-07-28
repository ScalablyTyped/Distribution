package typings.marked.markedMod.TokensNs

import typings.marked.markedMod.Token
import typings.marked.markedStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends Token {
  var lang: js.UndefOr[String] = js.undefined
  var text: String
  var `type`: code
}

object Code {
  @scala.inline
  def apply(text: String, `type`: code, lang: String = null): Code = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Code]
  }
}

