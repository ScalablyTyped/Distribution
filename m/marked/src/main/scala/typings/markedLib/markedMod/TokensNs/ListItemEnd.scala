package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemEnd
  extends markedLib.markedMod.Token {
  var `type`: markedLib.markedLibStrings.list_item_end
}

object ListItemEnd {
  @scala.inline
  def apply(`type`: markedLib.markedLibStrings.list_item_end): ListItemEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListItemEnd]
  }
}

