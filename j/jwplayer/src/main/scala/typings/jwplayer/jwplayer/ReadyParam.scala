package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyParam extends js.Object {
  var setupTime: Double
  var viewable: `0` | `1`
}

object ReadyParam {
  @scala.inline
  def apply(setupTime: Double, viewable: `0` | `1`): ReadyParam = {
    val __obj = js.Dynamic.literal(setupTime = setupTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadyParam]
  }
}

