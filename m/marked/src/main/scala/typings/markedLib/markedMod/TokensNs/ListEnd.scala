package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnd
  extends markedLib.markedMod.Token {
  var `type`: markedLib.markedLibStrings.list_end
}

object ListEnd {
  @scala.inline
  def apply(`type`: markedLib.markedLibStrings.list_end): ListEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListEnd]
  }
}

