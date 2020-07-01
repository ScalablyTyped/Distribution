package typings.marked.mod.Tokens

import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Def extends Token {
  var href: String
  var raw: String
  var title: String
}

object Def {
  @scala.inline
  def apply(href: String, raw: String, title: String): Def = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Def]
  }
}

