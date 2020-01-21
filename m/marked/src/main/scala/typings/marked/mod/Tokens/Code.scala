package typings.marked.mod.Tokens

import typings.marked.markedStrings.code
import typings.marked.markedStrings.indented
import typings.marked.mod.Token
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
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

