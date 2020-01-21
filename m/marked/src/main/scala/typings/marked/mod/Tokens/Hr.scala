package typings.marked.mod.Tokens

import typings.marked.markedStrings.hr
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hr extends Token {
  var `type`: hr
}

object Hr {
  @scala.inline
  def apply(`type`: hr): Hr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hr]
  }
}

