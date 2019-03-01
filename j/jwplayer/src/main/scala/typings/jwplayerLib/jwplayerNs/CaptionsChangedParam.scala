package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsChangedParam extends js.Object {
  var currentTrack: scala.Double
}

object CaptionsChangedParam {
  @scala.inline
  def apply(currentTrack: scala.Double): CaptionsChangedParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTrack")(currentTrack)
    __obj.asInstanceOf[CaptionsChangedParam]
  }
}

