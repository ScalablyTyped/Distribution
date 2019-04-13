package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hr
  extends markedLib.markedMod.Token {
  var `type`: markedLib.markedLibStrings.hr
}

object Hr {
  @scala.inline
  def apply(`type`: markedLib.markedLibStrings.hr): Hr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Hr]
  }
}

