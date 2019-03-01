package typings
package markedLib.markedMod.markedNs.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML
  extends markedLib.markedMod.markedNs.Token {
  var pre: scala.Boolean
  var text: java.lang.String
  var `type`: markedLib.markedLibStrings.html
}

object HTML {
  @scala.inline
  def apply(pre: scala.Boolean, text: java.lang.String, `type`: markedLib.markedLibStrings.html): HTML = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("pre")(pre)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[HTML]
  }
}

