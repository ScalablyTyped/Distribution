package typings.marked.mod.Tokens

import typings.marked.markedStrings.br
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Br extends Token {
  var raw: String
  var `type`: br
}

object Br {
  @scala.inline
  def apply(raw: String, `type`: br): Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Br]
  }
}

