package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayParam extends js.Object {
  var oldstate: jwplayerLib.jwplayerLibStrings.buffering | jwplayerLib.jwplayerLibStrings.playing
  var viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
}

object PlayParam {
  @scala.inline
  def apply(
    oldstate: jwplayerLib.jwplayerLibStrings.buffering | jwplayerLib.jwplayerLibStrings.playing,
    viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
  ): PlayParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlayParam]
  }
}

