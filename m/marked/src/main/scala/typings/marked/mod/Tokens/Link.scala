package typings.marked.mod.Tokens

import typings.marked.markedStrings.link
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends Token {
  var href: String
  var raw: String
  var text: String
  var title: String
  var tokens: js.UndefOr[js.Array[Text]] = js.undefined
  var `type`: link
}

object Link {
  @scala.inline
  def apply(
    href: String,
    raw: String,
    text: String,
    title: String,
    `type`: link,
    tokens: js.Array[Text] = null
  ): Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

