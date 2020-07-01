package typings.marked.mod.Tokens

import typings.marked.markedStrings.image
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends Token {
  var href: String
  var raw: String
  var text: String
  var title: String
  var `type`: image
}

object Image {
  @scala.inline
  def apply(href: String, raw: String, text: String, title: String, `type`: image): Image = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

