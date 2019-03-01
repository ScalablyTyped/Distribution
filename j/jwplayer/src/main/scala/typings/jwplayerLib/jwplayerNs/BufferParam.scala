package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferParam extends js.Object {
  var newstate: java.lang.String
  var oldstate: java.lang.String
  var reason: jwplayerLib.jwplayerLibStrings.loading | jwplayerLib.jwplayerLibStrings.complete | jwplayerLib.jwplayerLibStrings.stalled | jwplayerLib.jwplayerLibStrings.error
}

object BufferParam {
  @scala.inline
  def apply(
    newstate: java.lang.String,
    oldstate: java.lang.String,
    reason: jwplayerLib.jwplayerLibStrings.loading | jwplayerLib.jwplayerLibStrings.complete | jwplayerLib.jwplayerLibStrings.stalled | jwplayerLib.jwplayerLibStrings.error
  ): BufferParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newstate")(newstate)
    __obj.updateDynamic("oldstate")(oldstate)
    __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferParam]
  }
}

