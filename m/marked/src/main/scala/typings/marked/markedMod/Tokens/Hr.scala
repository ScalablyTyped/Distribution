package typings.marked.markedMod.Tokens

import typings.marked.markedMod.Token
import typings.marked.markedStrings.hr
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
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Hr]
  }
}

