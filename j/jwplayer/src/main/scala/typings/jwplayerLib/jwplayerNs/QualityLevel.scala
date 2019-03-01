package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualityLevel extends js.Object {
  var level: Level
  var mode: jwplayerLib.jwplayerLibStrings.auto | jwplayerLib.jwplayerLibStrings.manual
  var reason: jwplayerLib.jwplayerLibStrings.auto | jwplayerLib.jwplayerLibStrings.api | (jwplayerLib.jwplayerLibStrings.`initial choice`)
}

object QualityLevel {
  @scala.inline
  def apply(
    level: Level,
    mode: jwplayerLib.jwplayerLibStrings.auto | jwplayerLib.jwplayerLibStrings.manual,
    reason: jwplayerLib.jwplayerLibStrings.auto | jwplayerLib.jwplayerLibStrings.api | (jwplayerLib.jwplayerLibStrings.`initial choice`)
  ): QualityLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualityLevel]
  }
}

