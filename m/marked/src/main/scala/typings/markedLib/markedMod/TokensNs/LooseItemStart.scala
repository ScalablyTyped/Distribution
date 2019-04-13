package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LooseItemStart
  extends markedLib.markedMod.Token {
  var `type`: markedLib.markedLibStrings.loose_item_start
}

object LooseItemStart {
  @scala.inline
  def apply(`type`: markedLib.markedLibStrings.loose_item_start): LooseItemStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LooseItemStart]
  }
}

