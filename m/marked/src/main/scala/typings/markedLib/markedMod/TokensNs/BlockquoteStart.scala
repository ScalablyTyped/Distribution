package typings
package markedLib.markedMod.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockquoteStart
  extends markedLib.markedMod.Token {
  var `type`: markedLib.markedLibStrings.blockquote_start
}

object BlockquoteStart {
  @scala.inline
  def apply(`type`: markedLib.markedLibStrings.blockquote_start): BlockquoteStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockquoteStart]
  }
}

