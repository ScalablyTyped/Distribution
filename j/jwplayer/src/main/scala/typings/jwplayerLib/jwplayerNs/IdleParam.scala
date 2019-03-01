package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleParam extends js.Object {
  var oldstate: jwplayerLib.jwplayerLibStrings.buffering | jwplayerLib.jwplayerLibStrings.playing | jwplayerLib.jwplayerLibStrings.paused
}

object IdleParam {
  @scala.inline
  def apply(
    oldstate: jwplayerLib.jwplayerLibStrings.buffering | jwplayerLib.jwplayerLibStrings.playing | jwplayerLib.jwplayerLibStrings.paused
  ): IdleParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oldstate")(oldstate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleParam]
  }
}

