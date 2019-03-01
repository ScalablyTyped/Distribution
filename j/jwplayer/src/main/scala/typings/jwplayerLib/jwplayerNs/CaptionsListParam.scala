package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsListParam extends js.Object {
  var tracks: js.Array[_]
}

object CaptionsListParam {
  @scala.inline
  def apply(tracks: js.Array[_]): CaptionsListParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tracks")(tracks)
    __obj.asInstanceOf[CaptionsListParam]
  }
}

