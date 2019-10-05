package typings.marked.markedMod.Tokens

import typings.marked.markedMod.Token
import typings.marked.markedStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Space extends Token {
  var `type`: space
}

object Space {
  @scala.inline
  def apply(`type`: space): Space = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Space]
  }
}

