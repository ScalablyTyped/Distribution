package typings
package markedLib.markedMod.markedNs.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Space
  extends markedLib.markedMod.markedNs.Token {
  var `type`: markedLib.markedLibStrings.space
}

object Space {
  @scala.inline
  def apply(`type`: markedLib.markedLibStrings.space): Space = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Space]
  }
}

