package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import typings.jwplayer.jwplayerStrings.buffering
import typings.jwplayer.jwplayerStrings.playing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayParam extends js.Object {
  var oldstate: buffering | playing
  var viewable: `0` | `1`
}

object PlayParam {
  @scala.inline
  def apply(oldstate: buffering | playing, viewable: `0` | `1`): PlayParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlayParam]
  }
}

