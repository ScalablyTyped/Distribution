package typings.marked.markedMod.Tokens

import typings.marked.markedMod.Token
import typings.marked.markedStrings.code
import typings.marked.markedStrings.indented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends Token {
  var codeBlockStyle: js.UndefOr[indented] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var text: String
  var `type`: code
}

object Code {
  @scala.inline
  def apply(text: String, `type`: code, codeBlockStyle: indented = null, lang: String = null): Code = {
    val __obj = js.Dynamic.literal(text = text)
    __obj.updateDynamic("type")(`type`)
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Code]
  }
}

