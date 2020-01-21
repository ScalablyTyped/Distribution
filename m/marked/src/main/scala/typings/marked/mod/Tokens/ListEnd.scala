package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_end
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnd extends Token {
  var `type`: list_end
}

object ListEnd {
  @scala.inline
  def apply(`type`: list_end): ListEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnd]
  }
}

